package com.hdy.restful.config;

import org.springframework.stereotype.Component;

/**
 * @program: restful
 * @description: 返回数据格式工具类
 * @author: Andy
 * @create: 2019-10-29 15:27
 **/

@Component
public class ResponseUtil {
    private String code ;
    private String desc ;
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
