package com.andreev.orderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Collections;


@SpringBootApplication
public class OrderServiceApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication app = new SpringApplication(OrderServiceApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8090"));
        ConfigurableApplicationContext context = app.run(args);
    }

}
