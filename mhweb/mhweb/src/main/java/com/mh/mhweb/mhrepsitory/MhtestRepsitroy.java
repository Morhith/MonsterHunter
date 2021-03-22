/*
 * @Author: Hitysept
 * @Date: 2021-03-21 16:36:51
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-21 17:44:05
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\mhrepsitory\MhtestRepsitroy.java
 */
package com.mh.mhweb.mhrepsitory;

import java.util.List;

import com.mh.mhweb.bean.mhtest;

import org.springframework.data.repository.CrudRepository;

public interface  MhtestRepsitroy extends CrudRepository<mhtest, Integer> {
        List<mhtest> findByNickname(String nickname);
        void deleteByNickname(String nickname);
    }