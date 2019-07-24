package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
import java.util.Map;

/**
 * Created with:IntelliJ IDEA
 * USER:wangyue
 * DATE:2019/7/22
 * TIME:11:44
 */
@Mapper
public interface populationAnalysisMapper {

    public List<Object> getSexInfo(Map<String,Object> param);
//四个民族
    //汉
    public List<Map<String,Object>> getNationInfo1();

    //少数
    public Map<String,Object> getNationInfo3();

    public  List<Object> getMinNationInfo();

    public List<Object> getCommunityPopuInfo();
    int getTotalPopulation();

    public  List<Object> getAgeInfo(Map<String, Object> param);

     public List<Map<String,Object>> getAgeStructureInfo(Map<String,Object> param);



}
