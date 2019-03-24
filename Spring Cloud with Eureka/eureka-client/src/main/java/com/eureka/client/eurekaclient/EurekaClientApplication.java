package com.eureka.client.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}

/**Need to inject as we need to initialize it before the Eureka client gets registered and thus makes it available to
 RestTemplate*/
@Configuration
class CustomConfig {
    @LoadBalanced
    @Bean
    RestTemplate getRestTemplateBean() {
        return new RestTemplate();
    }
}
