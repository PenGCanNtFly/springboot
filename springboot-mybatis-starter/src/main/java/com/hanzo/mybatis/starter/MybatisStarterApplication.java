package com.hanzo.mybatis.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hanzo.mybatis.starter.mapper")
public class MybatisStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisStarterApplication.class, args);
	}
}
