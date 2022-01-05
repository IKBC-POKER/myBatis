package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class demo {
    private static final Logger logger = LoggerFactory.getLogger(demo.class);
    @Autowired
    UserMapper userMapper;

    public static void main(String[] args) {
        logger.info("开始计算集合");
        List<Map<String,Object>> list = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Map map = new HashMap();
            map.put("id",i);
            map.put("name",i);
            list.add(map);
        }
        list.stream().forEach(data ->{
            Map map = (Map) data;
            System.out.println(map.get("id"));
        });
        list.stream().sorted(Comparator.comparingInt(e ->(Integer)(e.get("id")))).collect(Collectors.toList());
        System.out.println(list);
    }
}
