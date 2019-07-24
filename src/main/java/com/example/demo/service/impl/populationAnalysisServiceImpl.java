package com.example.demo.service.impl;

import com.example.demo.mapper.populationAnalysisMapper;
import com.example.demo.service.populationAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created with:IntelliJ IDEA
 * USER:wangyue
 * DATE:2019/7/22
 * TIME:14:08
 */
@Service
public class populationAnalysisServiceImpl implements populationAnalysisService {
    @Autowired
    private populationAnalysisMapper populationAnalysisMapper;
    @Override
    public Map<String,Object> getSexInfo(Map<String,Object> param) {
        Map<String,Object> map=new LinkedHashMap<>(3);
        List<Object> list=populationAnalysisMapper.getSexInfo(param);
        map.put("title","性别");
        map.put("seriesData",list);
        return map;
    }

    @Override
    public Map<String, Object> getNationInfo() {

     List<Map<String,Object>> alist=populationAnalysisMapper.getNationInfo1();
         Map<String,Object> alist2=populationAnalysisMapper.getNationInfo3();
//        Map map=new HashMap();
//        map.put("name","少数民族");
      alist2.put("name","少数民族");
        alist.add(alist2);

//        List<Object> list=new LinkedList<>();
//        list.add(alist);


        Map<String,Object> map1=new LinkedHashMap<>();
        map1.put("seriesData",alist);
        return map1;
    }

    @Override
    public Map<String, Object> getMinNationInfo() {
        Map<String,Object> map=new LinkedHashMap<>();
        List<Object> list=populationAnalysisMapper.getMinNationInfo();
        map.put("seriesData",list);
        return map;
    }

    @Override
    public Map<String, Object> getCommunityPopuInfo() {
        Map<String,Object> map=new LinkedHashMap<>(5);
        List list=populationAnalysisMapper.getCommunityPopuInfo();
        int a=populationAnalysisMapper.getTotalPopulation();
        map.put("title","社区人口总排名");
        map.put("totalPopulation",a);
        map.put("communityData",list);
        return map;
    }

    @Override
    public Map<String, Object> getAgeInfo(Map<String, Object> param) {
        Map<String,Object> result = new HashMap<>(3);
        List<Object> ageList = populationAnalysisMapper.getAgeInfo(param);
        result.put("title","年龄");
        result.put("description","人口数/年龄(岁)");
        result.put("ageData",ageList);
        return result;
    }

    @Override
    public Map<String, Object> getAgeStructureInfo(Map<String, Object> param) {
        //求每个年龄的总人数
       List<Map<String,Object>> totilagelist= populationAnalysisMapper.getAgeStructureInfo(param);

        Map<String,Object> result = new HashMap<>(5);
      result.put("title","分性别人口的年龄结构");
      result.put("description","人口占比/年龄(岁)");
      result.put("ageData",totilagelist);
        return result;
    }


}
