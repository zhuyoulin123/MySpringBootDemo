package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhuyoulin
 * @program IntelliJ IDEA
 * @description Application 例子
 * @create 2022-03-13 23:18
 **/
@EnableAutoConfiguration
@ComponentScan
@Configuration
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
