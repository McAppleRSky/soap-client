package ru.mrs.ws.client.soap.dev.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.mrs.ws.client.soap.dev.config.description.iDescriptionServerRequest;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootTest
class TargetServerRequestTest {
    @Autowired
    private iDescriptionServerRequest descriptionServerRequest;
    @Test
    void mainTest() {
        URL descriptionUrl = null;
        try {
            descriptionUrl = descriptionServerRequest.getDescriptionUrl();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("file://tst.name.ts:123/sys/v0.1/ab?dis",descriptionUrl.toString(),"assert url fail");
    }
}