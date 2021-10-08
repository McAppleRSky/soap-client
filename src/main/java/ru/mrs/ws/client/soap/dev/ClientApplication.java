package ru.mrs.ws.client.soap.dev;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.slf4j.LoggerFactory.getLogger;

@SpringBootApplication
public class ClientApplication
        implements ApplicationRunner
    {
    private static final Logger logger = getLogger(ClientApplication.class);

    @Value("${request.wsd.url.hostname}")
    private String urlHostName;

        @Override
        public void run(ApplicationArguments args) throws Exception {
            logger.info(urlHostName);
        }

        public static void main(String[] args) {
            SpringApplication.run(ClientApplication.class, args);
        }

    }
