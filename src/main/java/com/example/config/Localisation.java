package com.example.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class Localisation {
    @Bean
    MessageSource messageSource(){
        var messageSource=new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:/i18n/bundle");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
