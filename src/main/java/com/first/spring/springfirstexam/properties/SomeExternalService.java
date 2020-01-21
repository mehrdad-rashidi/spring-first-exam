package com.first.spring.springfirstexam.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
    @Value("${http://someserver.dev.com/service}")
    private String url;

    public String returnSrviceUrl(){

        return url;
    }
}
