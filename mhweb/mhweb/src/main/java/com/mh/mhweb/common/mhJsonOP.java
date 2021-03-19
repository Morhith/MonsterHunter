/*
 * @Author: Hitysept
 * @Date: 2021-03-19 19:06:39
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-19 21:57:01
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\common\mhJsonOP.java
 */
package com.mh.mhweb.common;

import com.alibaba.fastjson.JSON;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public class mhJsonOP {
    /**
     * @description: 通过request来获取到json数据
     * @param {*}
     * @return {*}
     */
    @ResponseBody
    public String getByJson(@RequestBody JSONObject jsonParam) throws JSONException{
        // 直接将json信息打印出来
        System.out.println(JSON.toJSONString(jsonParam));
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "json");
        result.put("data", jsonParam);
        return JSON.toJSONString(jsonParam);
    }
}

