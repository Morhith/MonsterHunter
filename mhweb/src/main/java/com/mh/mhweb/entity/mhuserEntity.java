
/*
 * @Author: Hitysept
 * @Date: 2021-03-25 00:46:19
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-25 21:32:01
 * @Description: file contentpackage com.mh.mhweb.entity;
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\entity\mhuserEntity.java
 */
package com.mh.mhweb.entity;

import java.time.LocalDateTime;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity(name="mhuser")
@Table(appliesTo="mhuser")
@Data
@AllArgsConstructor // 全参构造方法
@NoArgsConstructor // 无参构造方法
public class mhuserEntity extends CommonEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int user_id;
    private int user_group_id;
    private int user_class_id;
    private int sale_class_id;
    private int store_id;
    private String realname;
    private String nickname;
    private int gender;
    private String email;
    private String telephone;
    private String user_pwd;
    private String image;
    private String description;
    private int newsletter;
    private int address_id;
    private String user_field;
    private String ip;
    private int user_status;
    private int status;
    private int safe;
    private String token;
    private LocalDateTime createDate;
    private LocalDateTime lastModifiedDate;
}