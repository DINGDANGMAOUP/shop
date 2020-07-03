package com.dzh.leyou.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@EnableDiscoveryClient
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class RegistryMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistryMainApplication.class,args);
    }
}
