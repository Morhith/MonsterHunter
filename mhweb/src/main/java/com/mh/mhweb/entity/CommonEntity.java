/*
 * @Author: Hitysept
 * @Date: 2021-03-24 23:07:53
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-25 20:39:19
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\entity\CommonEntity.java
 */
package com.mh.mhweb.entity;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
//该注解标注的类不会映射到数据库中单独的表，该类所拥有的属性都将映射到其子类
@MappedSuperclass
public abstract class CommonEntity {
    
}

