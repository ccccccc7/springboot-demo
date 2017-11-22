package com.zyl.web.controller;

import com.zyl.web.dto.RESTfulResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zyl
 */
@RestController
public class HomeController {
    @GetMapping("/home")
    public RESTfulResult<?> index() {
        return new RESTfulResult<>(true, "hello world");
    }

    @PostMapping("/error")
    public RESTfulResult<?> error() {
        return new RESTfulResult<>(false, "error demo");
    }
}
