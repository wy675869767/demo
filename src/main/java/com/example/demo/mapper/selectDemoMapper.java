package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import javax.validation.constraints.Null;
import java.util.List;
import java.util.Map;

/**
 * Created with:IntelliJ IDEA
 * USER:wangyue
 * DATE:2019/7/19
 * TIME:15:41
 */
@Mapper
public interface selectDemoMapper {

    public List selectByGuangNei();
}
