
/*
 * @Author: Hitysept
 * @Date: 2021-03-25 03:48:33
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-25 16:30:20
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\service\mhuserService.java
 */
package com.mh.mhweb.service;

import java.util.List;

import com.mh.mhweb.entity.mhuserEntity;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface mhuserService {
     //根据信息搜索用户
     List<mhuserEntity> getAll();

     // 普通分页
     Page<mhuserEntity> getPage(Integer pageNum, Integer pageLimit);
 
     // 排序分页
     Page<mhuserEntity> getPageSort(Integer pageNum, Integer pageLimit);
     
     //保存用户
     void savaUser(mhuserEntity user);
}