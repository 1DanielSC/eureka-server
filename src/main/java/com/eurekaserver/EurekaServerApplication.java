package com.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//import org.springframework.context.annotation.Bean;

// import brave.sampler.Sampler;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

	// @Bean
	// public Sampler defaultSampler(){
	// 	return Sampler.ALWAYS_SAMPLE;
	// }

}
