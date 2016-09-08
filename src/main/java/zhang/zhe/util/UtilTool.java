package zhang.zhe.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.Logger;
import zhang.zhe.util.config.MsgPropertie;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

/**
 * 工具方法类
 * Created by zhengzhou on 15-1-13.
 */
public class UtilTool {
    //log4j
    private static Logger logger = org.apache.logging.log4j.LogManager.getLogger(UtilTool.class);

    private final static String DES = "des";
    //编码格式  程序UTF-8
    private final static String CODE_CHARTSET = "UTF-8";

    public final static Properties msgProperties = MsgPropertie.getInstance().prop;

    /**
     * RequestParams相关参数
     *
     * @param request
     * @return
     * @throws Exception
     */
    public static HashMap<String, String> getRequestParam(HttpServletRequest request) throws Exception {
        Enumeration eObj = request.getParameterNames();
        HashMap<String, String> returnMap = null;
        if (eObj != null) {
            returnMap = new HashMap<String, String>();
            while (eObj.hasMoreElements()) {
                Object obj = eObj.nextElement();
                if (obj == null || obj.toString().trim().length() < 1
                        || obj.toString().trim().equals("m") || obj.toString().equals(request.getQueryString()))
                    continue;

                Object val = null;
                val = request.getParameter(obj.toString());

                if(val==null||(val instanceof String && val.toString().trim().length()==0)){
                    continue;
                }
                returnMap.put(obj.toString(), val == null ? null : val.toString());
            }
        }
        return returnMap;
    }

    /**
     * 验证是否是数字
     *
     * @param str
     * @return
     */
    public static boolean isNum(String str) {
        if (str == null || str.trim().length() == 0)
            return false;
        return str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
    }

    public static boolean isMobile(String str){
        if (str == null || str.trim().length() == 0)
            return false;
        return (str.trim().matches("^1[3|4|5|8][0-9]\\d{4,8}$")&&str.trim().length()==11);
    }

    /**
     * 存入Session 中。
     *
     * @param request HttpServletRequest对象
     * @param key     存入Session的key
     * @param val     存入Session的value（值）
     */
    public static void setAttributeSession(HttpServletRequest request, String key,
                                           Object val) {
        if (key == null)
            return;
        request.getSession().setAttribute(key, val);
    }

    /**
     * 得到session 中 key的值
     *
     * @param request
     * @param key
     * @return
     */
    public static Object getAttributeSession(HttpServletRequest request, String key) {
        if (key == null)
            return null;
        return request.getSession().getAttribute(key);
    }

    /**
     * 日期转换(将String类型换成时间格式)
     *
     * @param str
     * @param dt
     * @return
     */
    public static Date StringConvertToDate(String str, EnumUtil.DateType dt) {
        if (str == null || str.trim() == "")
            return null;
        if (dt == null) {
            if (str.indexOf("GMT") != -1)
                dt = EnumUtil.DateType.DATE_GMT;
            else
                dt = EnumUtil.DateType.DATE_FULL;
        }
        if (str.indexOf("年") != -1 || str.indexOf("月") != -1
                || str.indexOf("日") != -1 || str.indexOf("时") != -1
                || str.indexOf("分") != -1 || str.indexOf("秒") != -1)
            str = str.replace("年", "-").replace("月", "-").replace("日", "")
                    .replace("时", ":").replace("分", ":").replace("秒", "");

        SimpleDateFormat daformat = null;
        if (EnumUtil.DateType.DATE == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE.toString());
        } else if (EnumUtil.DateType.DATE_2 == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_2.toString());
        } else if (EnumUtil.DateType.DATE_FULL == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_2.toString());
        } else if (EnumUtil.DateType.DATE_FULL_2 == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_FULL_2.toString());
        } else if (EnumUtil.DateType.DATE_HOUR24 == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_HOUR24.toString());
        } else if (EnumUtil.DateType.DATE_HOUR24_2 == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_HOUR24_2.toString());
        } else if (EnumUtil.DateType.DATE_TIME == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_TIME.toString());
        } else if (EnumUtil.DateType.DATE_GMT == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_GMT.toString(), Locale.ENGLISH);
        } else if (EnumUtil.DateType.DATE_HOUR24_MIN_2 == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_HOUR24_MIN_2.toString());
        } else if (EnumUtil.DateType.DATE_MONTH_DAY_2 == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_MONTH_DAY_2.toString());
        }
        Date returndt = null;
        try {
            returndt = daformat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return returndt;
    }

    /**
     * 从DATE 转换成 String
     *
     * @param da
     * @param dt
     * @return
     */
    public static String DateConvertToString(Date da, EnumUtil.DateType dt) {
        if (da == null || dt == null)
            return null;
        SimpleDateFormat daformat = null;
        if (EnumUtil.DateType.DATE == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE.toString());
        } else if (EnumUtil.DateType.DATE_2 == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_2.toString());
        } else if (EnumUtil.DateType.DATE_FULL == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_FULL.toString());
        } else if (EnumUtil.DateType.DATE_FULL_2 == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_FULL_2.toString());
        } else if (EnumUtil.DateType.DATE_HOUR24 == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_HOUR24.toString());
        } else if (EnumUtil.DateType.DATE_HOUR24_2 == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_HOUR24_2.toString());
        } else if (EnumUtil.DateType.DATE_TIME == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_TIME.toString());
        } else if (EnumUtil.DateType.DATE_GMT == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_GMT.toString(), Locale.ENGLISH);
        } else if (EnumUtil.DateType.DATE_SIMPLE_CHINA == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_SIMPLE_CHINA.toString());
        } else if (EnumUtil.DateType.DATE_FULL_CHINA == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_FULL_CHINA.toString());
        } else if (EnumUtil.DateType.DATE_2_SHORT == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_2_SHORT.toString());
        } else if (EnumUtil.DateType.DATE_SHORT == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_SHORT.toString());
        } else if (EnumUtil.DateType.DATE_HOUR24_MIN_2 == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_HOUR24_MIN_2.toString());
        } else if (EnumUtil.DateType.DATE_MONTH_DAY_2 == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_MONTH_DAY_2.toString());
        } else if (EnumUtil.DateType.DATE_MONTHANDDAY == dt) {
            daformat = new SimpleDateFormat(EnumUtil.DateType.DATE_MONTHANDDAY.toString());
        }
        return daformat.format(da);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String a = DateConvertToString(new Date(), EnumUtil.DateType.DATE_SHORT);
        System.out.println(a);
    }

    /**
     * 从String 转换成 DATE
     *
     * @param str
     * @return
     */
    public static Date StringConvertToDate(String str) {
        if (str == null || str.trim() == "")
            return null;
        return StringConvertToDate(str, null);
    }

    /**
     * Description 根据键值进行加密
     *
     * @param data
     * @param key  加密键byte数组
     * @return
     * @throws Exception
     */
    public static String encrypt(String data, String key) throws Exception {
        byte[] bt = encrypt(data.getBytes(), key.getBytes());
        String strs = encodeBase64(bt);
        return strs;
    }

    /**
     * Description 根据键值进行解密
     *
     * @param data
     * @param key  加密键byte数组
     * @return
     * @throws java.io.IOException
     * @throws Exception
     */
    public static String decrypt(String data, String key) throws IOException,
            Exception {
        if (data == null)
            return null;

        byte[] buf = decodeBase64Byte(data);
        byte[] bt = decrypt(buf, key.getBytes());
        return new String(bt);
    }

    /**
     * Description 根据键值进行加密
     *
     * @param data
     * @param key  加密键byte数组
     * @return
     * @throws Exception
     */
    private static byte[] encrypt(byte[] data, byte[] key) throws Exception {
        // 生成一个可信任的随机数源
        SecureRandom sr = new SecureRandom();

        // 从原始密钥数据创建DESKeySpec对象
        DESKeySpec dks = new DESKeySpec(key);

        // 创建一个密钥工厂，然后用它把DESKeySpec转换成SecretKey对象
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
        SecretKey securekey = keyFactory.generateSecret(dks);

        // Cipher对象实际完成加密操作
        Cipher cipher = Cipher.getInstance(DES);

        // 用密钥初始化Cipher对象
        cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);

        return cipher.doFinal(data);
    }


    /**
     * Description 根据键值进行解密
     *
     * @param data
     * @param key  加密键byte数组
     * @return
     * @throws Exception
     */
    private static byte[] decrypt(byte[] data, byte[] key) throws Exception {
        // 生成一个可信任的随机数源
        SecureRandom sr = new SecureRandom();

        // 从原始密钥数据创建DESKeySpec对象
        DESKeySpec dks = new DESKeySpec(key);

        // 创建一个密钥工厂，然后用它把DESKeySpec转换成SecretKey对象
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
        SecretKey securekey = keyFactory.generateSecret(dks);

        // Cipher对象实际完成解密操作
        Cipher cipher = Cipher.getInstance(DES);

        // 用密钥初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE, securekey, sr);

        return cipher.doFinal(data);
    }


    // 将 URL 编码
    public static String urlEncode(String str) {
        String target;
        try {
            target = URLEncoder.encode(str, CODE_CHARTSET);
        } catch (Exception e) {
            logger.error("编码出错！", e);
            throw new RuntimeException(e);
        }
        return target;
    }

    // 将 URL 解码
    public static String urlDecode(String str) {
        String target;
        try {
            target = URLDecoder.decode(str, CODE_CHARTSET);
        } catch (Exception e) {
            logger.error("解码出错！", e);
            throw new RuntimeException(e);
        }
        return target;
    }

    // 将字符串 Base64 编码
    public static String encodeBase64(byte[] bt) {
        String target;
        try {
            target = Base64.encodeBase64String(bt);
        } catch (Exception e) {
            logger.error("编码出错！", e);
            throw new RuntimeException(e);
        }
        return target;
    }

    // 将字符串 Base64 编码
    public static String encodeBase64(String str) {
        String target;
        try {
            target = Base64.encodeBase64URLSafeString(str.getBytes(CODE_CHARTSET));
        } catch (UnsupportedEncodingException e) {
            logger.error("编码出错！", e);
            throw new RuntimeException(e);
        }
        return target;
    }


    // 将字符串 Base64 解码
    public static String decodeBase64(String str) {
        String target;
        try {
            target = new String(Base64.decodeBase64(str), CODE_CHARTSET);
        } catch (UnsupportedEncodingException e) {
            logger.error("解码出错！", e);
            throw new RuntimeException(e);
        }
        return target;
    }

    // 将字符串 Base64 解码
    public static String decodeBase64(byte[] bt) {
        String target;
        try {
            target = new String(Base64.decodeBase64(bt));
        } catch (Exception e) {
            logger.error("解码出错！", e);
            throw new RuntimeException(e);
        }
        return target;
    }

    // 将字符串 Base64 解码
    public static byte[] decodeBase64Byte(byte[] bt) {
        byte[] target;
        try {
            target = Base64.decodeBase64(bt);
        } catch (Exception e) {
            logger.error("解码出错！", e);
            throw new RuntimeException(e);
        }
        return target;
    }

    // 将字符串 Base64 解码
    public static byte[] decodeBase64Byte(String str) {
        byte[] target;
        try {
            target = Base64.decodeBase64(str);
        } catch (Exception e) {
            logger.error("解码出错！", e);
            throw new RuntimeException(e);
        }
        return target;
    }


    // 将字符串 MD5 加密
    public static String encryptMD5(String str) {
        return DigestUtils.md5Hex(str);
    }

    // 将字符串 SHA 加密
    public static String encryptSHA(String str) {
        return DigestUtils.sha1Hex(str);
    }

    // 创建随机数
    public static String createRandom(int count) {
        return RandomStringUtils.randomNumeric(count);
    }

    // 获取UUID（32位）
    public static String createUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 执行后台远程访问
     *
     * @param url
     * @return
     * @throws java.io.IOException
     */
    public static String getHttpResponce(String url) throws IOException {
        HttpClient client = new HttpClient();
        StringBuilder sb = new StringBuilder();
        InputStream ins = null;
        // Create a method instance.
        GetMethod method = new GetMethod(url);

        try {
            // Execute the method.
            int statusCode = client.executeMethod(method);

            if (statusCode == HttpStatus.SC_OK) {
                ins = method.getResponseBodyAsStream();
                byte[] b = new byte[1024];
                int r_len = 0;
                while ((r_len = ins.read(b)) > 0) {
                    sb.append(new String(b, 0, r_len, method
                            .getResponseCharSet()));
                }
            } else {
                //System.err.println("Response Code: " + statusCode);
                logger.info("Response Code: " + statusCode);
            }
        } catch (HttpException e) {
            logger.error(e);
        } catch (IOException e) {
            logger.error(e);
        } finally {
            method.releaseConnection();
            if (ins != null) {
                ins.close();
            }
        }

        return sb.toString();
    }

    /**
     * 判断字符串是否不为空或者null
     *
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        return StringUtils.isNotEmpty(str);
    }

    /**
     * 判断字符串是否为空或者null
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return StringUtils.isEmpty(str);
    }

    // 若字符串为空，则取默认值
    public static String defaultIfEmpty(String str, String defaultValue) {
        return StringUtils.defaultIfEmpty(str, defaultValue);
    }

    private static boolean checkParamName(String paramName) {
        return !paramName.equals("_"); // 忽略 jQuery 缓存参数
    }

    // 转发请求
    public static void forwardRequest(String path, HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher(path).forward(request, response);
        } catch (Exception e) {
            logger.error("转发请求出错！", e);
            throw new RuntimeException(e);
        }
    }

    // 重定向请求
    public static void redirectRequest(String path, HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect(request.getContextPath() + path);
        } catch (Exception e) {
            logger.error("重定向请求出错！", e);
            throw new RuntimeException(e);
        }
    }

    // 发送错误代码
    public static void sendError(int code, HttpServletResponse response) {
        try {
            response.sendError(code);
        } catch (Exception e) {
            logger.error("发送错误代码出错！", e);
            throw new RuntimeException(e);
        }
    }

    // 判断是否为 AJAX 请求
    public static boolean isAJAX(HttpServletRequest request) {
        return request.getHeader("X-Requested-With") != null;
    }

    // 获取请求路径
    public static String getRequestPath(HttpServletRequest request) {
        String servletPath = request.getServletPath();
        String pathInfo = defaultIfEmpty(request.getPathInfo(), "");
        return servletPath + pathInfo;
    }

    // 从 Cookie 中获取数据
    public static String getCookie(HttpServletRequest request, String name) {
        String value = "";
        try {
            Cookie[] cookieArray = request.getCookies();
            if (cookieArray != null) {
                for (Cookie cookie : cookieArray) {
                    if (isNotEmpty(name) && name.equals(cookie.getName())) {
                        value = urlDecode(cookie.getValue());
                        break;
                    }
                }
            }
        } catch (Exception e) {
            logger.error("获取 Cookie 出错！", e);
            throw new RuntimeException(e);
        }
        return value;
    }

    // 设置 Redirect URL 到 Session 中
    public static void setRedirectURL(HttpServletRequest request, String sessionKey) {
        if (!isAJAX(request)) {
            String requestPath = getRequestPath(request);
            request.getSession().setAttribute(sessionKey, requestPath);
        }
    }

    // 创建验证码
    public static String createCaptcha(HttpServletResponse response) {
        StringBuilder captcha = new StringBuilder();
        try {
            // 参数初始化
            int width = 60;                      // 验证码图片的宽度
            int height = 25;                     // 验证码图片的高度
            int codeCount = 4;                   // 验证码字符个数
            int codeX = width / (codeCount + 1); // 字符横向间距
            int codeY = height - 4;              // 字符纵向间距
            int fontHeight = height - 2;         // 字体高度
            int randomSeed = 10;                 // 随机数种子
            char[] codeSequence = {              // 验证码中可出现的字符
                    '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
            };
            // 创建图像
            BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = bi.createGraphics();
            // 将图像填充为白色
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, width, height);
            // 设置字体
            g.setFont(new Font("Courier New", Font.BOLD, fontHeight));
            // 绘制边框
            g.setColor(Color.BLACK);
            g.drawRect(0, 0, width - 1, height - 1);
            // 产生随机干扰线（160条）
            g.setColor(Color.WHITE);
            // 创建随机数生成器
            Random random = new Random();
            for (int i = 0; i < 160; i++) {
                int x = random.nextInt(width);
                int y = random.nextInt(height);
                int xl = random.nextInt(12);
                int yl = random.nextInt(12);
                g.drawLine(x, y, x + xl, y + yl);
            }
            // 生成随机验证码
            int red, green, blue;
            for (int i = 0; i < codeCount; i++) {
                // 获取随机验证码
                String validateCode = String.valueOf(codeSequence[random.nextInt(randomSeed)]);
                // 随机构造颜色值
                red = random.nextInt(255);
                green = random.nextInt(255);
                blue = random.nextInt(255);
                // 将带有颜色的验证码绘制到图像中
                g.setColor(new Color(red, green, blue));
                g.drawString(validateCode, (i + 1) * codeX - 6, codeY);
                // 将产生的随机数拼接起来
                captcha.append(validateCode);
            }
            // 禁止图像缓存
            response.setHeader("Cache-Control", "no-store");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);
            // 设置响应类型为 JPEG 图片
            response.setContentType("image/jpeg");
            // 将缓冲图像写到 Servlet 输出流中
            ServletOutputStream sos = response.getOutputStream();
            ImageIO.write(bi, "jpeg", sos);
            sos.close();
        } catch (Exception e) {
            logger.error("创建验证码出错！", e);
            throw new RuntimeException(e);
        }
        return captcha.toString();
    }


    // 是否为 IE 浏览器
    public boolean isIE(HttpServletRequest request) {
        String agent = request.getHeader("User-Agent");
        return agent != null && agent.contains("MSIE");
    }

    /**
     * 根据一个时间得到距离当前时间多久
     *
     * @param d   时间
     * @param day 多少天后直接显示年，月,日
     * @param dt1 日期格式
     * @return
     */
    public static String getAFewTimeAgo(Date d, int day, EnumUtil.DateType dt1) {
        String timeString = "";
        if (d == null) return timeString;
        long now = System.currentTimeMillis();
        long time = now - d.getTime();
        if ((time / 1000) < 60) {
            return ((time / 1000) <= 1 ? 1 : (time / 1000)) + "秒前";
        }
        if ((time / (1000 * 60)) < 60) {
            return (time / (1000 * 60)) + "分钟前";
        }
        if ((time / (1000 * 60 * 60)) < 24) {
            return (time / (1000 * 60 * 60)) + "小时前";
        }
        if ((time / (1000 * 60 * 60 * 24)) > 0) {
            if ((time / (1000 * 60 * 60 * 24)) > day) {
                return DateConvertToString(d, dt1);
            }
            return (time / (1000 * 60 * 60 * 24)) + "天前";
        }
        return timeString;
    }

    /**
     * 活动详情页使用
     * 根据一个时间得到距离当前时间多久以后
     * 如果>=1天显示“xx天xx时xx分”；如果<1天且>=1小时显示“xx时xx分”；如果<1小时且>=1分钟显示“xx分”；
     * 如果<1分钟显示“xx秒”；如果活动已结束显示“0”
     * @param d  时间
     * @return
     */
    public static String getAFewTimeLater(Date d){
        String timeString = "";
        if (d == null) return timeString;
        long now = System.currentTimeMillis();
        long time = d.getTime() - now;
        if(time <= 0){
            return "0";
        }
        if ((time / 1000) < 60) {
            return ((time / 1000) <= 1 ? 1 : (time / 1000)) + "秒";
        }
        if ((time / (1000 * 60)) < 60) {
            return (time / (1000 * 60)) + "分";
        }
        if ((time / (1000 * 60 * 60)) < 24) {
            return (time / (1000 * 60 * 60)) + "时" + (time % (1000 * 60 * 60))/(1000 * 60) + "分" ;
        }
        if ((time / (1000 * 60 * 60 * 24)) > 0) {
            return (time / (1000 * 60 * 60 * 24)) + "天" + (time % (1000 * 60 * 60 * 24))/(1000 * 60 * 60) + "时" + (time % (1000 * 60 * 60))/(1000 * 60) + "分";
        }
        return timeString;
    }

    /**
     * 转换成JSON
     *
     * @return
     * @throws Exception
     */
    public String toJSON() {
        return toJSON(this);

    }

    /**
     * 转换成JSON
     *
     * @param obj
     * @return
     */
    public static String toJSON(Object obj) {
        if (obj == null)
            return null;
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        return gson.toJson(obj);
    }

    /**
     * JSON转换成实体
     *
     * @param json
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T jsonToModel(String json, Class<T> clazz) {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        return gson.fromJson(json, clazz);
    }

    /**
     * 支持列表类型转换 比如：TypeToken<List<Person>>(){}.getTypeId()
     *
     * @param json
     * @param type new TypeToken<List<Person>>(){}.getTypeId()
     * @param <T>
     * @return
     */
    public static <T> List<T> jsonToArray(String json, Type type) {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        return gson.fromJson(json, type);
    }

    public static boolean isEmptyDomainObject(Object obj) throws Exception {
        if (obj == null) {
            return true;
        }
        Object ref;
        try {
            ref = obj.getClass().getMethod("getRef", null);
        } catch (NoSuchMethodException e) {
            throw new Exception("Not Domain Object.");
        }

        if (ref == null) {
            return true;
        }

        if (ref instanceof BigDecimal) {
            if (((BigDecimal) ref).longValue() < 1) {
                return true;
            }
        } else if (ref instanceof Long) {
            if (((Long) ref).longValue() < 1) {
                return true;
            }
        } else if (ref instanceof Integer) {
            if (((Integer) ref).intValue() < 1) {
                return true;
            }
        } else if (ref instanceof Short) {
            if (((Short) ref).shortValue() < 1) {
                return true;
            }
        }

        return false;
    }


    /**
     * 截取字符串长度
     * @param str
     * @param length   字符长度  一个中文算2个
     * @param suffix
     * @return
     */
    public static String substr(String str, int length, String suffix) throws Exception {
        if (str == null || str.length() == 0 || length < 1) {
            return str;
        }
        if (suffix == null) {
            suffix = "";
        }
        if (suffix.length() > 0 && length > suffix.length()) {
            length = length - suffix.length();
        } else {
            suffix = "";
        }

        int lencounter = 0;
        int index = 0;
        char[] strarray = str.toCharArray();
        try {
            for (; index < strarray.length; index++) {
                char ch = strarray[index];
                int step = 1;
                if (String.valueOf(ch).getBytes("GBK").length > 1) {
                    step = 2;
                }
                if ((lencounter = lencounter + step) > length) {
                    index--;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (index > 0 && index < str.length()) {
            str = str.substring(0, index) + suffix;
        }

        return str;
    }

    /**
     * 验证一个数组中是否存在
     * @param array
     * @param item
     * @return
     */
    public static boolean arrayIsHasItem(Object[] array,Object item){
        if(array==null||array.length<1)return false;
        int index = Arrays.binarySearch(array, item);
        return (index!=-1);
    }
}
