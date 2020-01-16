package com.linwu.statistics.linwustatistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class LinwuStatisticsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinwuStatisticsApplication.class, args);
    }

}
