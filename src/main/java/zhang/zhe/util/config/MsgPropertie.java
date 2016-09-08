package zhang.zhe.util.config;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zzm
 */
public class MsgPropertie {
    private volatile static MsgPropertie instance;

    public java.util.Properties prop = null;

    /**
     * <b>Summary: </b>
     * <p/>
     * 双重检查加锁，提高了单纯使用synchronized的性能
     *
     * @return
     */

    public static MsgPropertie getInstance() {
        if (instance == null) {
            synchronized (MsgPropertie.class) {
                if (instance == null) {
                    instance = new MsgPropertie();
                    instance.getProperties();
                }
            }
        }
        return instance;
    }

    /**
     * 加载配置文件
     */
    public void getProperties() {
        prop = new java.util.Properties(); // 创建一个Properties 类的引用
        try {
            InputStream is = MsgPropertie.class.getResourceAsStream("/properties/msg.properties");
            if (is == null)
                is = new FileInputStream(getPropertiesConfigPath("msg.properties"));
            System.out.println(is);
            prop.load(is); // 加载配置文件
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * junit测试时，有问题
     *
     * @param name
     * @return
     */
    private String getPropertiesConfigPath(String name) {
        ServletRequestAttributes srabutes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = null;
        if (srabutes == null) {//
            request = new MockHttpServletRequest();
        } else
            request = ((ServletRequestAttributes) srabutes).getRequest();
        File f = new File(request.getRealPath("/") + "/../resources/properties/" + name);
        if (f.exists())
            return f.getPath();
        return request.getRealPath("/") + "/../../src/main/resources/properties/" + name;
    }

}
