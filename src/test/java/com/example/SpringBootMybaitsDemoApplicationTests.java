package com.example;

import com.example.entity.User;
import com.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
class SpringBootMybaitsDemoApplicationTests {
    @Resource
    private UserService userService;

    @Test
    void testGetOneUser() {
        User user = userService.getUser(123456L);
        log.info("查询成功--->id={},Name={},age={}", user.getId(), user.getName(), user.getAge());
    }

}
