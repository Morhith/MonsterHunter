
/*
 * @Author: Hitysept
 * @Date: 2021-03-25 00:56:46
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-25 16:25:45
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\mhdao\mhuserDao.java
 */
package com.mh.mhweb.mhdao;

import com.mh.mhweb.entity.mhuserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface mhuserDao extends JpaRepository<mhuserEntity,Integer>{
}