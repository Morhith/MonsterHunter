/*
 * @Author: Hitysept
 * @Date: 2021-03-19 19:06:39
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-20 22:26:56
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\common\mhJsonOP.java
 */
package com.mh.mhweb.common;

import java.util.HashMap;
import java.util.Map;

public class mhJsonOP {
    /**
     * @description: 
     * @param {*}
     * @return {*}
     */
    public static Map<String, String> jsonToMap(String jsonParam)throws Exception{

        if(null == jsonParam){ 
            throw new Exception("参数为空"); 
        }
        else{
            
            Map<String, String> map = new HashMap<String,String>();

            String[] aParam = jsonParam.split("&");

            for (String sParam : aParam) {
                String[] aKPV =  sParam.split("=");
                map.put(aKPV[0],aKPV[1]);
            }

            return map;

        }


    }
}

