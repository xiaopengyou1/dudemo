package com.expleam.demodudu;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.expleam.demodudu.mapper.PangMapper;
import com.expleam.demodudu.pojo.PangZai;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CRUDTest {
    @Autowired
    public PangMapper pangMapper;

    @Autowired
    public PangZai pangZai;

    /**
     * 根据雪花算法生成分布式id
     */
    @Test
    void insert(){

//        PangZai pangZai = new PangZai();
        pangZai.setId((long) 26);
        pangZai.setUsername("111");
        pangZai.setPassword("444");
        //pangZai.setId(4);

        //返回值：影响的行数
        int insert = pangMapper.insert(pangZai);
        System.out.println("影响的行数：" + insert);
        System.out.println("user id:" + pangZai.getId());
    }

    @Test
    void update(){
//        pangMapper.update(pangZai,1);
    }
}
