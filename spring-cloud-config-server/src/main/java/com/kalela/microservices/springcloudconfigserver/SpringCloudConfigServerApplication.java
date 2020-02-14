package com.kalela.microservices.springcloudconfigserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import javax.annotation.PostConstruct;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication {

	@Autowired
	Configuration configuration;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}

//	@PostConstruct
//	private void setConfig() {
//		System.out.println("env = " + System.getenv());
//		System.out.println("I am here " + System.getenv("GIT_PASSWORD"));
//		configuration.setPassword(System.getenv("GIT_PASSWORD"));
//	}

}
