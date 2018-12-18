package com.wuicelone.smd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wuicelone.smd.mapper")
public class SmdApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmdApplication.class, args);
    }

}

