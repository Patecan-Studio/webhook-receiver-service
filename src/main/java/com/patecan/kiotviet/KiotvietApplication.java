package com.patecan.kiotviet;

import com.patecan.kiotviet.services.ConnectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableFeignClients
@EnableConfigurationProperties
public class KiotvietApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(KiotvietApplication.class, args);
//
//        // Get the service bean from the application context
//        ConnectService connectService = context.getBean(ConnectService.class);
//
//        // Execute a method in the service
//        connectService.getKiotVietAccessToken();
    }

}
