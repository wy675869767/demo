package com.example.demo;

import com.example.demo.mapper.populationAnalysisMapper;
import com.example.demo.service.populationAnalysisService;
import com.example.demo.service.selectDemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
@Autowired selectDemoService selectDemoService;
@Autowired
populationAnalysisService populationAnalysisService;
    @Test
    public void contextLoads() {
      List list=selectDemoService.selectByGuangNei();
        System.out.println(list);
    }
    @Test
    public  void testSex(){

        Map map=new HashMap();
        map.put("communityId","110102025012");
      Map map1= populationAnalysisService.getSexInfo(map);
        System.out.println(map1);
    }
@Test
    public void testNation(){
       Map map= populationAnalysisService.getNationInfo();
    System.out.println(map);

}
@Test
    public  void testMinZu(){
        Map map=populationAnalysisService.getMinNationInfo();
    System.out.println(map);

    }
    @Test
    public void testCommity(){
        Map map=populationAnalysisService.getCommunityPopuInfo();
        System.out.println(map);
    }
    @Test
    public void testAge(){
        Map map=new HashMap();
        map.put("communityid","110102025012");
        Map map1=populationAnalysisService.getAgeInfo(map);
        System.out.println(map1);
    }
    @Test
    public void testageData(){
        Map map=new HashMap();
        map.put("AgeStructure","110102025012");
        Map map1=populationAnalysisService.getAgeStructureInfo(map);
        System.out.println(map1);
    }
}
