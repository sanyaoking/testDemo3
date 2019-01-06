package com.mengchaob.testDemo3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@MapperScan("com.mengchaob.testDemo3.user")
public class TestDemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(TestDemo3Application.class, args);
	}

}

