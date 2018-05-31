package com.zyl.web.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zyl.web.domain.demo.Demo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zyl
 */
@Mapper
public interface DemoMapper extends BaseMapper<Demo> {
    Demo selectDemoById(Long id);
}
