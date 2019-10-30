package com.wxy.modelbyjpa.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author wangxiaoyuan
 * @Date 19-10-30 下午3:46
 * @Description TODO
 **/
@Data
@MappedSuperclass
public class BaseEntity {
    @Id
    @Column(name = "id",columnDefinition="bigint(20) not null comment '主键ID(自增)'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;// 主键ID(自增)
}
