package ru.mrs.ws.client.soap.dev.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.mrs.ws.client.soap.dev.service.base.TargetUrl;

@Service
public class RequestBasic implements iBaseRequest {
    @Value("${request.wsd.url.host}")
    private String wsdHostUrl;
    @Value("${request.wsd.url.hostname}")
    private String wsdHostnameUrl;
    @Value("${request.wsd.url.target}")
    private String _targetUrl;
    private TargetUrl targetUrl;
    {
        targetUrl = TargetUrl.valueOf(_targetUrl.toUpperCase());
    }
    @Override
    public String requestDescription() {
        return null;
    }

    @Override
    public String requestSchema() {
        return null;
    }
}
