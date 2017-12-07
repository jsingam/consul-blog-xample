package com.singam;

import com.sun.jndi.toolkit.url.Uri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jjegasingam on 7/18/2017.
 */

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class Application {

    @Autowired
    DiscoveryClient client;



    RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/test")
    public Object test() throws MalformedURLException {


        List<ServiceInstance> serviceInstances=client.getInstances("student-service");
        ServiceInstance serviceInstance=serviceInstances.get(0);
        serviceInstance.getHost();
        URI uri =serviceInstance.getUri();
        System.out.println(uri+"/students/3");


        String url = "http://localhost:8090/test";

            return restTemplate.getForObject(uri+"/students/3", Object.class);

        }





    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}

