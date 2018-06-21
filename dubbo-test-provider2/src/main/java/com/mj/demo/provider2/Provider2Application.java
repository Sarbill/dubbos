package com.mj.demo.provider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo/dubbo-provider.xml"})
@PropertySource("classpath:dubbo/dubbo-provider.properties")
public class Provider2Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider2Application.class, args);
    }
}
