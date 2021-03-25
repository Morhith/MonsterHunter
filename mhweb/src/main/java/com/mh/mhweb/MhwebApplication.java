package com.mh.mhweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//自动填充或更新实体中的CreateDate、CreatedBy
@EnableJpaAuditing
@ComponentScan("com.mh.mhweb")
public class MhwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MhwebApplication.class, args);
		System.out.println("springboot 启动成功！");
	}

}
