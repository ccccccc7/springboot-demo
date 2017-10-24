package com.zyl.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zyl
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("/home/index");
        mv.addObject("text", "hello world!");
        return mv;
    }
}
