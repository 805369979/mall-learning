package com.mybatis.mybatis;

import com.mybatis.mybatis.component.CancelOrderSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    CancelOrderSender sender;
    @Test
    void contextLoads() {
        sender.sendMessage(1L,0);
    }

}
