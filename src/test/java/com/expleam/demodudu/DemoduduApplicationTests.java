package com.expleam.demodudu;

import com.expleam.demodudu.mapper.PangMapper;
import com.expleam.demodudu.pojo.PangZai;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoduduApplicationTests {
    @Autowired
    public PangMapper pangMapper;

    @Test
    void contextLoads() {
        List<PangZai> pangZais = pangMapper.selectList(null);
        pangZais.forEach(System.out::println);
    }

}
