package com.zyl.web.controller;

import com.zyl.core.config.ConfigBean;
import com.zyl.core.model.RestfulResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyl
 */
@RestController
public class HomeController {
    @Autowired
    private ConfigBean configBean;


    @GetMapping("/home")
    public RestfulResponse<?> index() {
        return new RestfulResponse<>(true, "hello world");
    }

    @PostMapping("/error")
    public RestfulResponse<?> error() {
        return new RestfulResponse<>(false, "error demo");
    }
}
