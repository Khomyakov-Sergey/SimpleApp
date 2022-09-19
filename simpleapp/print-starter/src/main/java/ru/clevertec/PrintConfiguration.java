package ru.clevertec;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(PrintProperties.class)
public class PrintConfiguration {

    @Bean
    @ConditionalOnProperty(name = "print.text", havingValue = "true")
    public PrintListener printListener() {
        return new PrintListener();
    }
}
