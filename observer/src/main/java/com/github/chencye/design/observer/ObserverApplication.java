package com.github.chencye.design.observer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author chencye
 */
@SpringBootApplication
@EnableScheduling
public class ObserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(ObserverApplication.class, args);
    }
}
