package com.expleam.demodudu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.expleam.demodudu.mapper")
public class DemoduduApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoduduApplication.class, args);
    }

}
