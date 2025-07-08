package ru.micro.ordermicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"ru.micro.entity", "ru.micro.ordermicro"})
public class OrderMicroApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderMicroApplication.class, args);
    }

}
