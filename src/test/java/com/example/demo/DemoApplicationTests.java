package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private Comtroller controller;

	@Test
	@DisplayName("컨텍스트 로드 테스트")
	void contextLoads() {
		assertNotNull(context);
	}
	
	@Test
	@DisplayName("컨트롤러 빈 로드 테스트")
	void controllerLoads() {
		assertNotNull(controller);
	}

}
