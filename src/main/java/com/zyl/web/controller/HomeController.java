package com.zyl.web.controller;

import com.zyl.core.config.ConfigBean;
import com.zyl.web.domain.baseinfo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyl
 */
@Controller
public class HomeController {
    @Autowired
    private ConfigBean configBean;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("/home/index");
        List<Person> list = new ArrayList<>();

        Person person = new Person("zhangsan", 19);
        list.add(person);
        person = new Person("lisi", 19);
        list.add(person);
        person = new Person("wangwu", 19);
        list.add(person);

        mv.addObject("list", list);
        return mv;
    }
}
