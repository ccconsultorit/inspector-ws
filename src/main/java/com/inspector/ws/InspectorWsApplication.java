package com.inspector.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan({"com.inspector.ws.repositories", "com.inspector.ws.controller"})
public class InspectorWsApplication {

    public static void main(String[] args) {
        SpringApplication.run(InspectorWsApplication.class, args);
    }

}
