package zhang.zhe.util;


import org.apache.commons.lang.ArrayUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.util.CollectionUtils;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * JSON实体
 *
 * @author zzm
 */
public class ReturnEntity {
    private static Logger logger = LogManager.getLogger(ReturnEntity.class);
    // 状态 success Or error
    private Integer result = 0;//默认失败
    // 输出打印的信息
    private String msg;

    public ReturnEntity(Integer result) {
        this.setResult(result);
    }

    // 获得的结果
    public ReturnEntity(Integer result, Object data) {
        this.setResult(result);
        this.setData(data);
    }


    public ReturnEntity() {
        super();
    }

    /**
     * 状态 success Or error
     *
     * @return
     */
    public Integer getResult() {
        return result;
    }

    // 分页信息
    private Object data;

    /**
     * 分页信息
     *
     * @return
     */
    public Object getData() {
        return data;
    }

    /**
     * 分页信息
     *
     * @param
     */
    public void setData(Object obj) {
        if(obj!=null){
            if(obj.getClass().isArray()&& (ArrayUtils.isEmpty((Object[])obj)))
                obj=null;
            else if(obj instanceof Collection && CollectionUtils.isEmpty((Collection) obj))
                obj=null;
            else if((obj instanceof Map &&((Map)obj).keySet().isEmpty())
                    ||(obj instanceof HashMap &&((HashMap)obj).keySet().isEmpty())
                    ||(obj instanceof LinkedHashMap &&((LinkedHashMap)obj).keySet().isEmpty())
                    )
                obj=null;
        }
        this.data = obj;
    }

    /**
     * 状态 success error
     *
     * @param result
     */
    public void setResult(Integer result) {
        if(result!=null&&result==0)
            result=-1;
        this.result = result;
        if (result != null) {
            this.msg = UtilTool.msgProperties.getProperty("" + result);
        }
        if(this.result>0&&this.result!=3&&this.result!=2&&this.result!=1)
            this.result=1;

    }

    public void setMsgParam(String param) {
        this.msg = MessageFormat.format(this.msg, param);
    }

    /**
     * 输出打印的信息
     *
     * @return
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 输出打印的信息
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }


}
