package com.example.demo;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
	private Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
	@Autowired
	private UserMapper userMapper;

	@Test
	void contextLoads() {
		User user = userMapper.selectById("1");
		System.out.println(user);
	}

}
