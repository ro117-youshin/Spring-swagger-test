package com.example.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJpaRepositories(basePackages = "com.example.swagger.repository") // com.example.swagger.repository 하위에 있는 jpaRepository를 상속한 repository scan
@EntityScan(basePackages = "com.example.swagger.domain") // com.example.swagger.domain 하위에 있는 @Entity 클래스 scan
public class SwaggerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerTestApplication.class, args);
	}

}
