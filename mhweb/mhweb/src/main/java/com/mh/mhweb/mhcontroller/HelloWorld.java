/*
 * @Author: Hitysept
 * @Date: 2021-03-19 21:26:27
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-19 21:28:55
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\mhcontroller\HelloWorld.java
 */
package com.mh.mhweb.mhcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class HelloWorld {
    @RequestMapping("/")
    String home(){
        return "Hello word";
    }
}

