/*
 * @Author: Hitysept
 * @Date: 2021-03-21 18:02:13
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-21 21:32:25
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\mhcontroller\MhtestController.java
 */
package com.mh.mhweb.mhcontroller;

import java.util.Optional;

import com.alibaba.fastjson.JSONObject;
import com.mh.mhweb.bean.mhtest;
import com.mh.mhweb.mhrepsitory.MhtestRepsitroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/met")
public class MhtestController {
    private static final Logger log = LoggerFactory.getLogger(MhtestController.class);

    @Autowired
    private MhtestRepsitroy MhtestRepository;

    @RequestMapping("/add") // Map ONLY GET REQUESTs.
    public @ResponseBody JSONObject addNewUser (@RequestParam String nickname
                    , @RequestParam String email, @RequestParam String password, mhtest user) {
        // @ResponseBody means the returned String is a response, not a view name.
        int user_id = (int) System.currentTimeMillis();
        user_id = user_id+(int)(Math.random()*10);
        user.setUser_id(user_id);
        user.setNickname(nickname);
        user.setMhweb_user_password(password);
        MhtestRepository.save(user);
        System.out.println(email);
        log.info(user.toString()+" saved to the repo");
        JSONObject result = new JSONObject();

        result.put("status", "0");

        result.put("msg", "success!");

        return result;
    }
    @RequestMapping("/all")
    public @ResponseBody Iterable<mhtest> getAllUsers() {
        return MhtestRepository.findAll();
    }
    @RequestMapping("/findbyid")
    public @ResponseBody Optional<mhtest> getUsersById(@RequestParam Integer id) {
        return MhtestRepository.findById(id);
    }
}

