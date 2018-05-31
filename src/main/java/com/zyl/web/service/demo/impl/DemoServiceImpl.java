package com.zyl.web.service.demo.impl;

import com.zyl.core.model.RestfulResponse;
import com.zyl.web.dao.DemoMapper;
import com.zyl.web.domain.demo.Demo;
import com.zyl.web.service.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zyl
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoMapper demoMapper;

    @Override
    public RestfulResponse<Demo> selectDemoById(Long id) {
        return new RestfulResponse<>(demoMapper.selectById(id));
    }

    @Override
    public RestfulResponse<Integer> insert(Demo demo) {
        return new RestfulResponse<>(demoMapper.insert(demo));
    }
}
