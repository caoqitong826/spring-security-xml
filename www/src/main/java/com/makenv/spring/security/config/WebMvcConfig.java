package com.makenv.spring.security.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by caoqitong on 15-5-8.
 */
@Configuration @EnableWebMvc @ComponentScan("com.makenv.spring.security") public class WebMvcConfig
  extends WebMvcConfigurerAdapter {
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/**").addResourceLocations("/");
  }

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    //registry.addViewController("/").setViewName("index");
    //registry.addViewController("/login").setViewName("index");
    //        registry.addViewController("/login").setViewName("login");
  }
}
