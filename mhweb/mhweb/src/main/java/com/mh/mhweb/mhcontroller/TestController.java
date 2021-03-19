/*
 * @Author: Hitysept
 * @Date: 2021-03-19 19:02:46
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-19 23:59:39
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\mhcontroller\TestController.java
 */
package com.mh.mhweb.mhcontroller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/testpost",method = RequestMethod.POST)
    public String testpost(HttpServletRequest req){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream()));
            StringBuffer sb=new StringBuffer();
            String s=null;
            while((s=br.readLine())!=null){
                sb.append(s);
            }
            JSONObject jsonObject = JSONObject.parseObject(sb.toString());
            String name = jsonObject.getString("name");
            String age = jsonObject.getString("age");
            System.out.println("name:"+name+" age:"+age);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "server response";
    }
    @RequestMapping("/")
    public JSONObject Test(){
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "json");
        System.out.println("test");
        return result;       
    } 
}

