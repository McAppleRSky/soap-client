package ru.mrs.ws.client.soap.dev.config.description;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;
//@Configuration
public class DescriptionServerRequest implements iDescriptionServerRequest {
    @Value("${request.wsd.url.host}")
    private String wsdHostUrl;
    @Value("${request.wsd.url.hostname}")
    private String wsdHostnameUrl;
    @Value("${request.wsd.url.target}")
    private String _targetUrl;
    @Bean
    public iDescriptionServerRequest getDescriptionServerRequest(){
        return new DescriptionServerRequest();
    }
    public URL getDescriptionUrl() throws IllegalArgumentException, MalformedURLException {
        String result;
        TargetUrl targetUrl = TargetUrl.valueOf(_targetUrl.toUpperCase());
        switch (targetUrl) {
            case HOST: result=wsdHostUrl;
                break;
            case HOSTNAME: result=wsdHostnameUrl;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + targetUrl);
        }
        return new URL(result);
    }
}
