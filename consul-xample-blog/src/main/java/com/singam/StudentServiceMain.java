package com.singam;

import com.fasterxml.jackson.annotation.JsonView;
import com.singam.jview.DataView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StudentServiceMain {

    public static void main(String[] args) {
        SpringApplication.run(StudentServiceMain.class,args);
    }
}


