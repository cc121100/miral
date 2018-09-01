package com.cc.miral.testmodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestmodelApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestmodelApplication.class, args);
	}
}
