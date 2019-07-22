package com.example.demo.service.impl;

import com.example.demo.mapper.selectDemoMapper;
import com.example.demo.service.selectDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with:IntelliJ IDEA
 * USER:wangyue
 * DATE:2019/7/19
 * TIME:16:21
 */
@Service
public class selectDemoServiceImpl implements selectDemoService {

    @Autowired
    private selectDemoMapper selectDemoMapper;
    @Override
    public List selectByGuangNei() {

     List  list= selectDemoMapper.selectByGuangNei();

        return list;
    }
}
