package com.zyl.web.controller;

import com.zyl.core.model.RestfulResponse;
import com.zyl.web.domain.demo.Demo;
import com.zyl.web.service.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zyl
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public RestfulResponse<Demo> selectDemoById(@PathVariable Long id) {
        return demoService.selectDemoById(id);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public RestfulResponse<Integer> insert(@RequestBody Demo demo){
        return demoService.insert(demo);
    }
}
