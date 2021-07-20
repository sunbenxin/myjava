package com.sunbx.myjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MyjavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyjavaApplication.class, args);
    }

}
