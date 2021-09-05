package com.vnbd.svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath:/spring/applicationContext.xml" })
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class, org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class})
public class AppApplication {

    public static void main(String[] args) {
        System.setProperty("es.set.netty.runtime.available.processors", "false");
        SpringApplication.run(AppApplication.class, args);
    }

}
