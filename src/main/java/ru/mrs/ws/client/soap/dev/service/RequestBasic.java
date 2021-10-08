package ru.mrs.ws.client.soap.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mrs.ws.client.soap.dev.config.description.iDescriptionServerRequest;

@Service
public class RequestBasic implements iBaseRequest {
    @Autowired
    private iDescriptionServerRequest descriptionServerRequest;

    @Override
    public String requestDescription() {
        return null;
    }

    @Override
    public String requestSchema() {
        return null;
    }

}
