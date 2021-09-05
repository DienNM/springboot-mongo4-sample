package com.vnbd.svc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author deenguyen
 **/
@Configuration
@ComponentScan({ "com.dee"})
@ImportResource({ "classpath:/spring/applicationContext.xml" })
public class ApplicationConfigTest {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
