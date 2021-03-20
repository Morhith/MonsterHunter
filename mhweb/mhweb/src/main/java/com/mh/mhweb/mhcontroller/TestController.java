/*
 * @Author: Hitysept
 * @Date: 2021-03-19 19:02:46
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-20 22:51:06
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\mhcontroller\TestController.java
 */
package com.mh.mhweb.mhcontroller;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/test")
public class TestController extends MhController {
    /**
     * @description: 
     * @param {*} 参数param==xxx&param=xxx
     * @return {*} 返回 JSONObject
     */
    @RequestMapping(value = "/testpost",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONObject testpost(@RequestBody String jsonParam) throws Exception{

        System.out.println(jsonParam);

        Map<String,String> RP = new HashMap<String,String>();

        RP = jsonToMap(jsonParam);

        String name = RP.get("param");

        System.out.println(name);

        JSONObject result = new JSONObject();

        result.put("msgss", "okss");

        result.put("method", "json");

        return result;

    }
    @RequestMapping("/")
    public JSONObject Test(){

        JSONObject result = new JSONObject();

        result.put("msg", "ok");

        result.put("method", "json");

        return result;    

    } 
}

