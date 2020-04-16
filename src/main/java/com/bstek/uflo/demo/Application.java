package com.bstek.uflo.demo;

import com.bstek.uflo.console.UfloServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@EnableAutoConfiguration
@ImportResource("classpath:context.xml")
@ComponentScan("com/eshare/uflo/example")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Bean
    public ServletRegistrationBean buildUfloServlet(){
        return new ServletRegistrationBean(new UfloServlet(),"/uflo/*");
    }
}
