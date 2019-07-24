package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.demo.service.selectDemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

/**
 * Created with:IntelliJ IDEA
 * USER:wangyue
 * DATE:2019/7/19
 * TIME:16:42
 */
@RestController
@RequestMapping("/aaa")
@Api(description = "练习springboot")
public class selectDemoController {
    @Autowired
    private selectDemoService selectDemoService;
    @ApiOperation(value = "aaa")
    @RequestMapping("/aaab")
    public String wyselect(){
       List list= selectDemoService.selectByGuangNei();


       String aaa= JSON.toJSONString(list);
        return aaa;
    }
}
