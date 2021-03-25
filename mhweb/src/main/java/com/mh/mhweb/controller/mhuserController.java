
/*
 * @Author: Hitysept
 * @Date: 2021-03-25 03:53:34
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-25 20:50:10
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\controller\mhuserController.java
 */
package com.mh.mhweb.controller;

import java.util.List;

import com.mh.mhweb.entity.mhuserEntity;
import com.mh.mhweb.service.impl.mhuserServiceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class mhuserController {
    @Autowired
    mhuserServiceimpl mhuserService;
    @RequestMapping("/getuser")
    public List<mhuserEntity> getUserList(@RequestParam int user_id){
        return mhuserService.getAll();
    }
    @RequestMapping("/getTest")
    public String getTest(@RequestParam int user_id){

        return "Test:"+user_id;
    }
}