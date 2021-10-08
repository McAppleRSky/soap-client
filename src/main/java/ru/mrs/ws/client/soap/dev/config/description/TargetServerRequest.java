package ru.mrs.ws.client.soap.dev.config.description;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TargetServerRequest {
    @Bean
    public iDescriptionServerRequest getDescriptionServerRequest(){
        return new DescriptionServerRequest();
    }

}
