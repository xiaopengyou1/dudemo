package com.expleam.demodudu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PangZai {

    //@TableId(type = IdType.ASSIGN_ID)  分布式ID生成
    //@TableId(type = IdType.AUTO)   自增式
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String username;
    private String password;
}
