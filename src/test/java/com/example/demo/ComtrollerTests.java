package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(Comtroller.class)
public class ComtrollerTests {

    @Autowired
    private MockMvc mockMvc;
    
    @Autowired
    private Comtroller controller;

    @Test
    @DisplayName("인덱스 페이지 접근 테스트")
    public void testIndexPage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }
    
    @Test
    @DisplayName("Hello 엔드포인트 테스트")
    public void testHelloEndpoint() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World!"));
    }
    
    @Test
    @DisplayName("인사 메서드 테스트 - 이름 없음")
    public void testGreetWithoutName() {
        String result = controller.greet("");
        assertEquals("안녕하세요!", result);
    }
    
    @Test
    @DisplayName("인사 메서드 테스트 - 이름 있음")
    public void testGreetWithName() {
        String result = controller.greet("홍길동");
        assertEquals("안녕하세요, 홍길동님!", result);
    }
} 