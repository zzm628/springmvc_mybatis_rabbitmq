package zhang.zhe.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import zhang.zhe.controller.base.BaseController;
import zhang.zhe.model.UserInfo;
import zhang.zhe.service.IUserService;
import zhang.zhe.util.ReturnEntity;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zzm on 2016/9/7.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @Resource
    private IUserService userService;

    @Resource
    private AmqpTemplate amqpTemplate;

    @RequestMapping("/showUser.do")
    public String toIndex(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        UserInfo user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }

    @RequestMapping("/showUserJson.do")
    public void showUser(HttpServletRequest request,HttpServletResponse response) throws Exception{
        int userId = Integer.parseInt(request.getParameter("id"));
        ReturnEntity returnEntity = userService.getUserJSONById(userId);
        response.setCharacterEncoding("UTF-8");
        writeJSON(response,returnEntity);
    }

    @RequestMapping("/showUserJson1.do")
    public void showUser1(HttpServletRequest request,HttpServletResponse response) throws Exception{
        int userId = Integer.parseInt(request.getParameter("id"));
        UserInfo user = this.userService.getUserById(userId);
        //response.setCharacterEncoding("UTF-8");
        response.getWriter().write(user.getNickname());
        Map map = new HashMap();
        map.put("code",1);
        map.put("data",user);
        JSONObject jsonObject = new JSONObject(map);
        response.getWriter().write(jsonObject.toString());
    }

    @RequestMapping("/uploadImg.do")
    public String uploadImg(@RequestParam(value = "upload", required = false) MultipartFile file, HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception{

        if(file == null){
            response.sendRedirect("/upload.jsp");
            return null;
        }

        String path = request.getSession().getServletContext().getRealPath("upload");
        //String fileName = file.getOriginalFilename();
        String fileName = new Date().getTime()+".jpg";
        //System.out.println(path);
        File targetFile = new File(path, fileName);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }

        //保存
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("fileUrl", request.getContextPath()+"/upload/"+fileName);

        amqpTemplate.convertAndSend("queueTestKey", request.getContextPath() + "/upload/" + fileName);

        return "uploadImg";
    }

    @RequestMapping("/test.do")
    public void test(HttpServletResponse response) throws Exception{
        long t = new Date().getTime();
        amqpTemplate.convertAndSend("queueTestKey",t+"");
        response.getWriter().write(t+"");

    }
}
