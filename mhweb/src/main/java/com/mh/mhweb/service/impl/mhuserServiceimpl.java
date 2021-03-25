
/*
 * @Author: Hitysept
 * @Date: 2021-03-25 16:06:22
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-25 21:23:56
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\service\impl\mhuserServiceimpl.java
 */
package com.mh.mhweb.service.impl;

import java.util.List;

import com.mh.mhweb.entity.mhuserEntity;
import com.mh.mhweb.mhdao.mhuserDao;
import com.mh.mhweb.service.mhuserService;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class mhuserServiceimpl implements mhuserService{

    mhuserDao mhuserDao;
    @Override
    public List<mhuserEntity> getAll() {
        System.out.println(mhuserDao.findAll());
        return mhuserDao.findAll();
    }

    @Override
    public Page<mhuserEntity> getPage(Integer pageNum, Integer pageLimit) {
        return null;
    }

    @Override
    public Page<mhuserEntity> getPageSort(Integer pageNum, Integer pageLimit) {
        return null;
    }

    @Override
    public void savaUser(mhuserEntity user) {
       mhuserDao.save(user);
    }
    
}