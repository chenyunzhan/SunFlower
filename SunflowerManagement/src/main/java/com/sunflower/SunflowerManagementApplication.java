package com.sunflower;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sunflower.mapper")
public class SunflowerManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunflowerManagementApplication.class, args);
	}

}
