package com.zyl.web.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zyl.web.domain.demo.Demo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zyl
 */
@Mapper
public interface DemoMapper extends BaseMapper<Demo> {
    List<Demo> selectDemoById(Long id);
}
