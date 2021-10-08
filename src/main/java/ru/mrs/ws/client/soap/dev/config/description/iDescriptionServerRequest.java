package ru.mrs.ws.client.soap.dev.config.description;

import java.net.MalformedURLException;
import java.net.URL;

public interface iDescriptionServerRequest {
    URL getDescriptionUrl() throws IllegalArgumentException, MalformedURLException;
}
