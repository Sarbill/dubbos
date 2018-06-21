package com.mj.demo.dubbotestprovider;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo/dubbo-provider.xml"})
@PropertySource("classpath:dubbo/dubbo-provider.properties")
public class DubboTestProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboTestProviderApplication.class, args);
    }
}
