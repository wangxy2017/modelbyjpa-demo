package com.wxy.modelbyjpa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author wangxiaoyuan
 * @Date 19-10-30 下午3:48
 * @Description TODO
 **/
@Data
@Entity
@Table(name = "t_user")
@org.hibernate.annotations.Table(appliesTo = "t_user", comment = "用户表")
public class User extends BaseEntity {

    @Column(name = "name", columnDefinition = "varchar(20) comment '姓名'")
    private String name;

    @Column(name = "age", columnDefinition = "int(2) comment '年龄'")
    private Integer age;


}
