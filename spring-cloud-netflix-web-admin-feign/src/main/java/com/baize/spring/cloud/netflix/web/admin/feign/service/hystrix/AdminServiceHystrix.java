package com.baize.spring.cloud.netflix.web.admin.feign.service.hystrix;

import com.baize.spring.cloud.netflix.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
