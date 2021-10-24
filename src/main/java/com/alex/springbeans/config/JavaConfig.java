package com.alex.springbeans.config;

import com.alex.springbeans.service.JavaConfigService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.OffsetDateTime;

@Configuration
public class JavaConfig {

    @Bean("fullJavaConfigService")
    public JavaConfigService javaConfigService() {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        JavaConfigService javaConfigService = new JavaConfigService(offsetDateTime.toString());
        javaConfigService.setDayOfMonth(offsetDateTime.getDayOfMonth());
        return javaConfigService;
    }

    @Bean("pureJavaConfigService")
    @Primary
    public JavaConfigService javaConfigService1() {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        return new JavaConfigService(offsetDateTime.toString());
    }
}
