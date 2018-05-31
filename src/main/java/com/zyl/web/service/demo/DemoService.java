package com.zyl.web.service.demo;

import com.zyl.core.model.RestfulResponse;
import com.zyl.web.domain.demo.Demo;

/**
 * @author zyl
 */
public interface DemoService {
    RestfulResponse<Demo> selectDemoById(Long id);

    RestfulResponse<Integer> insert(Demo demo);
}
