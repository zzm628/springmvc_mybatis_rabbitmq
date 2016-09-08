package zhang.zhe.controller.base;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.apache.commons.beanutils.BeanUtils;
import zhang.zhe.util.ReturnEntity;
import zhang.zhe.util.UtilTool;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;

/**
 * Created by zhengzhou on 15-1-13.
 */
@Component
public class BaseController<T extends java.io.Serializable> {

    protected Logger log = org.apache.logging.log4j.LogManager.getLogger(getClass());

    /**
     * 将参数转换成实体成型
     *
     * @param request
     * @param clazz
     */
    public <T> Object getParameter(HttpServletRequest request,
                                   Class<? extends Object> clazz) {

        if (request == null || clazz == null)
            return null;

        Object obj = null;
        try {
            Enumeration<String> paraNameStrArr = request.getParameterNames();
                if (paraNameStrArr != null) {
                    obj = clazz.newInstance();
                    while (paraNameStrArr.hasMoreElements()) {
                        String paraNameStr = paraNameStrArr.nextElement();
                        Object paraVal = request.getParameter(paraNameStr);
                        // 进行封装成Entity
                        if (clazz != null && obj != null && paraVal != null) {
                            // _empty适用于jgrid的添加
                            if (paraVal != null &&paraVal.toString().length()>0 && !paraVal.equals("_empty")){
                                BeanUtils.copyProperty(obj, paraNameStr, paraVal);
                            }

                        }
                    }
            }
        } catch (InstantiationException e) {
            log.error(e);
            return null;
        } catch (IllegalAccessException e) {
            log.error(e);
            return null;
        } catch (InvocationTargetException e) {
            log.error(e);
            return null;
        }
        return (T) obj;
    }

    /**
     * 根据名称读取Cookie
     */
    public String readCookie(HttpServletRequest request, HttpServletResponse response,
                             String name) throws ServletException, IOException {
        String value = null;
        if (name != null) {
            Cookie cookies[] = request.getCookies();
            if (cookies != null) {
                for (int i = 0; i < cookies.length; i++) {
                    Cookie cookie = cookies[i];
                    if (name.equals(cookie.getName())) {
                        value = cookie.getValue();
                    }
                }
            }
        }
        return value;
    }

    /**
     * 清空cookie
     */
    public void clearCookie(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            Cookie cookie = cookies[i];
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
    }

    /**
     * 写Cookie
     */
    public void writeCookie(HttpServletRequest request, HttpServletResponse response,
                            String name, String value, int time) throws ServletException, IOException {
        Cookie cookie = new Cookie(name, value);
        cookie.setPath("/");
        cookie.setMaxAge(time);
        response.addCookie(cookie);
    }

    /**
     * response.getWrite().writeString(msg);
     *
     * @param response
     * @param msg
     */
    public void writeString(HttpServletResponse response, String msg) {
        try {
            log.debug(msg);
            response.getWriter().println(msg);
        } catch (IOException e) {
            log.error(e);
        }
    }

    /**
     * response.getWrite().writeString(msg);
     *
     * @param response
     * @param result   代码
     */
    public void writeJSON(HttpServletResponse response, Integer result) {
        try {
            ReturnEntity entity = new ReturnEntity(result);
            //entity.setData(new Object());
            String str = UtilTool.toJSON(entity);
            log.debug(str);
            response.getWriter().println(str);
        } catch (IOException e) {
            log.error(e);
        }
    }

    public void writeJSON(HttpServletResponse response, ReturnEntity entity) {
        if (entity.getData() == null) {
            entity.setData(new Object());
        }
        String str = UtilTool.toJSON(entity);
        try {
            log.debug(str);
            response.getWriter().println(str);
        } catch (IOException e) {
            log.error(e);
        }
    }
    public void writeJSON(HttpServletRequest request,HttpServletResponse response, ReturnEntity entity) {
        if (entity.getData() == null) {
            entity.setData(new Object());
        }
        String str = UtilTool.toJSON(entity);
        String callBackFun = request.getParameter("callback");
        try {
            log.debug(str);
            response.getWriter().write(callBackFun+"("+str+")");
        } catch (IOException e) {
            log.error(e);
        }
    }
    /**
     * 输出到页面
     * @param response
     * @param entity
     * @throws Exception
     */
    public void writeMsg(HttpServletResponse response,ReturnEntity entity){
        if(entity.getMsg()==null||entity.getMsg().trim().length()<1)
            return;
        try {
            response.getWriter().println("<script type='text/javascript'>alert('"+entity.getMsg()+"');</script>");
        }catch (Exception e){
            log.error(e);
        }

    }

}
