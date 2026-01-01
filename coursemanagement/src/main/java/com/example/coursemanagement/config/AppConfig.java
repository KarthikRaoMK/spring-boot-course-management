package com.example.coursemanagement.config;

import com.example.coursemanagement.device.Battery;
import com.example.coursemanagement.device.MobilePhone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Battery battery(){
        return new Battery();
    }
    @Bean
    public MobilePhone mobilePhone(Battery battery){
        return new MobilePhone(battery);
    }
}
