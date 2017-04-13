package com.hanzo.springboot.adminlte.velocity;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = MybatisAutoConfiguration.class)
@MapperScan("com.hanzo.springboot.adminlte.velocity.mapper")
public class SpringbootAdminlteVelocityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAdminlteVelocityApplication.class, args);
	}
}
