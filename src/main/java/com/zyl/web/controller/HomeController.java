package com.zyl.web.controller;

import com.zyl.core.config.ConfigBean;
import com.zyl.web.domain.baseinfo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import com.zyl.web.dto.RESTfulResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyl
 */
@RestController
public class HomeController {
    @Autowired
    private ConfigBean configBean;


    @GetMapping("/home")
    public RESTfulResult<?> index() {
        return new RESTfulResult<>(true, "hello world");
    }

    @PostMapping("/error")
    public RESTfulResult<?> error() {
        return new RESTfulResult<>(false, "error demo");
    }
}
