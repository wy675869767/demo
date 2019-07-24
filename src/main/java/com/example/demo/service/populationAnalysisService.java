package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created with:IntelliJ IDEA
 * USER:wangyue
 * DATE:2019/7/22
 * TIME:14:03
 */
@Service
public interface populationAnalysisService {
    Map<String,Object> getSexInfo(Map<String,Object> param);

    Map<String,Object> getNationInfo();
    Map<String,Object> getMinNationInfo();
    Map<String,Object> getCommunityPopuInfo();
    Map<String, Object> getAgeInfo(Map<String, Object> param);
    //统计某一社区每个年龄段男女比例
    Map<String,Object>  getAgeStructureInfo(Map<String, Object> param);
}
