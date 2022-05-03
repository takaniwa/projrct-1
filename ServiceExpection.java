package com.example.demo.exception;

import lombok.Getter;
/**
 * 自定义异常
 */
@Getter
public class ServiceExpection extends RuntimeException{
    private String code;

    public ServiceExpection(String code,String msg){
        super(msg);
        this.code = code;
    }
}
