package top.tang360.reader.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class ResponseUtils {
    //服务器处理的编码
    private String code;

    // 服务器返回的消息
    private String message;

    // 本次处理后，服务器返回的数据
    private Map data = new LinkedHashMap<>();


    //默认的构造方法
    public ResponseUtils() {
        this.code = "0";
        this.message = "success";
    }

    public ResponseUtils(String code, String message) {
        this.code = code;
        this.message = message;
    }

    // 用put的话可以一直put,put添加数据
    public ResponseUtils put(String key, Object value) {
        this.data.put(key, value);
        return  this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }
}
