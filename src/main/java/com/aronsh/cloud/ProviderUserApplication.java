package com.aronsh.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangyakun
 * @since 2017年12月27日18:46:57
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderUserApplication.class, args);
	}
}
