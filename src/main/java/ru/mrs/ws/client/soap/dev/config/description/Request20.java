package ru.mrs.ws.client.soap.dev.config.description;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:.credentials/20-request.properties")
public class Request20 {
    private String host, hostname, target;
}
