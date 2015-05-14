package com.makenv.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by caoqitong on 15-5-7.
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@ImportResource({"classpath:spring-security.xml"})
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
