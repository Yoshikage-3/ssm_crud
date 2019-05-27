package com.kira.crud.bean;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回的类
 *
 * @author Administrator
 */
@Data
public class Msg {
    private int code;//100为成功，200为失败
    private String msg;
    private Map<String, Object> extend = new HashMap<>();

    public static Msg success() {
        Msg result = new Msg();
        result.setCode(100);
        result.setMsg("处理成功！");
        return result;
    }

    public static Msg fail() {
        Msg result = new Msg();
        result.setCode(200);
        result.setMsg("处理失败！");
        return result;
    }

    public Msg add(String key,Object value){
        this.getExtend().put(key,value);
        return this;
    }
}
