package com.springboot.microservices.eureka.netflixeurekanameserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaNameServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaNameServerApplication.class, args);
	}
}
