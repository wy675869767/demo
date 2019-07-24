package com.example.demo.controller;

import com.example.demo.entity.Result;
import com.example.demo.service.populationAnalysisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.builder.ResultMapResolver;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created with:IntelliJ IDEA
 * USER:wangyue
 * DATE:2019/7/22
 * TIME:15:07
 */
//@ComponentScan(basePackages = {"com.example.demo.service","com.example.demo.mapper","com.example.demo.controller"})
//@MapperScan("com.example.demo.mapper")
@RestController
@Api(description = "系统分析--人口分析")
@RequestMapping("/populationAnalysis")
public class populationAnalysisController {
@Autowired
    private populationAnalysisService populationAnalysisService;
    @ApiOperation(value = "性别分析")
    @PostMapping("/getSexInfo")
    public Result selectSex(@RequestBody Map<String,Object> param){
      Map map=  populationAnalysisService.getSexInfo(param);
        return Result.success(map);
    }
    @ApiOperation(value = "minzu分析")
    @PostMapping("/getNationInfo")
    public Result seletNation(@RequestBody Map<String,String> param){
        Map map=populationAnalysisService.getNationInfo();
return Result.success(map);
    }
    @ApiOperation(value = "少数民族分析")
    @PostMapping("/getMinNationInfo")
    public Result selectMinZu(){
        Map map=populationAnalysisService.getMinNationInfo();
        return Result.success(map);
    }
    @ApiOperation(value = "社区人口比例")
    @PostMapping("/getCommunityPopuInfo")
   public Result getCommunityPopuInfo(){
        Map map=populationAnalysisService.getCommunityPopuInfo();
        return Result.success(map);
    }
    @PostMapping("/getAgeInfo")
    @ApiOperation(value = "年龄分析")
    public Result getAgeInfo(@RequestBody Map<String, Object> param){
        Map<String,Object> result = populationAnalysisService.getAgeInfo(param);
        return Result.success(result);
    }
    @PostMapping("/getAgeStructureInfo")
    @ApiOperation(value = "年龄占比分析")
    public Result getAgeStructureInfo(@RequestBody Map<String, Object> param){
        Map<String,Object> result=populationAnalysisService.getAgeStructureInfo(param);
        return Result.success(result);
    }
}
