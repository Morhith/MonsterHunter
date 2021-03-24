/*
 * @Author: Hitysept
 * @Date: 2021-03-24 23:07:53
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-24 23:10:17
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\entity\CommonEntity.java
 */
package com.mh.mhweb.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
//该注解标注的类不会映射到数据库中单独的表，该类所拥有的属性都将映射到其子类
@MappedSuperclass
public abstract class CommonEntity {
    @Id
    @Column(columnDefinition = "varchar(20) comment '主键'")
    private String id;
    @Column(columnDefinition = "int(11) default 0 comment '乐观锁'")
    private int version;
    @Column(columnDefinition = "timestamp default CURRENT_TIMESTAMP comment '创建时间'")
    private LocalDateTime createDate;
    @Column(columnDefinition = "timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '最后修改时间'")
    private LocalDateTime lastModifiedDate;
    @Column(columnDefinition = "int(2) default 0 comment '状态:0-有效，1-无效'")
    private int status;
}

