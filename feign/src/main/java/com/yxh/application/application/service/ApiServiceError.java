package com.yxh.application.application.service;


import org.springframework.stereotype.Component;

/**
 * @author super
 * @credte 2019-04-10-13:42
 */
@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "服务器故障";
    }
}
