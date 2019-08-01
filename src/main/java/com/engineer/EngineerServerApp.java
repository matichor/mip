package com.engineer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//extends SpringBootServletInitializer
@SpringBootApplication
//@ComponentScan(basePackages = "com.engineer")
//@EnableJpaRepositories
//@EntityScan("com.engineer")

public class EngineerServerApp  {
        public static void main(String[] args) {
            SpringApplication.run(EngineerServerApp.class, args);
        }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(EngineerServerApp.class);
//    }
}
