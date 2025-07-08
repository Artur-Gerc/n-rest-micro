package ru.micro.usermicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"ru.micro.entity", "ru.micro.usermicro"})
//@EnableJpaRepositories(basePackages = {"ru.micro.usermicro.repository"})
public class UserMicroApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserMicroApplication.class, args);
    }

}
