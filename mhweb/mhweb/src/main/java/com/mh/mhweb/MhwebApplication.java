/*
 * @Author: Hitysept
 * @Date: 2021-03-19 17:32:28
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-19 21:41:15
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\MhwebApplication.java
 */
package com.mh.mhweb;

import org.springframework.boot.SpringApplication;
// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MhwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MhwebApplication.class, args);
		System.out.println("hello world");
	}

}
