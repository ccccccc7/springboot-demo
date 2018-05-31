package com.zyl.web.service.demo;

import com.zyl.core.model.RestfulResponse;
import com.zyl.web.domain.demo.Demo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.CoreMatchers.*;

/**
 * @author zyl
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServiceTest {
    @Autowired
    private DemoService demoService;

    @Test
    public void selectDemoById() {
        RestfulResponse<Demo> result = demoService.selectDemoById(2L);
        Assert.assertThat(result.getData().getName(), is("demo"));
    }
}