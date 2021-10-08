package ru.mrs.ws.client.soap.dev.config.description;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(
        ignoreResourceNotFound = false,
        value="classpath:.credentials/10-server.properties")
public class Server10 {
    private String protocol
            ,host
            ,name //hostname
            ,port
            ,version
            ,entrypoint
            ;
}
