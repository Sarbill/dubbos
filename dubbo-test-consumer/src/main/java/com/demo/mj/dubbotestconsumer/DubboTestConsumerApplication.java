package com.demo.mj.dubbotestconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo/dubbo-consumer.xml"})
@PropertySource("classpath:dubbo/dubbo-consumer.properties")
public class DubboTestConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboTestConsumerApplication.class, args);
    }
}
