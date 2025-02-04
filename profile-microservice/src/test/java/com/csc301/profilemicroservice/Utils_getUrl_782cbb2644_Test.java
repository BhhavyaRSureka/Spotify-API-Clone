// Test generated by RoostGPT for test Spotify-Test using AI Type Open AI and AI Model gpt-4

package com.csc301.profilemicroservice;

import javax.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import okhttp3.RequestBody;
import java.util.Map;

public class Utils_getUrl_782cbb2644_Test {

    private HttpServletRequest request;

    @BeforeEach
    public void setup() {
        request = Mockito.mock(HttpServletRequest.class);
    }

    @Test
    public void testGetUrlWithQueryString() {
        Mockito.when(request.getRequestURL()).thenReturn(new StringBuffer("http://localhost:8080/test"));
        Mockito.when(request.getQueryString()).thenReturn("param1=value1&param2=value2");

        String expectedUrl = "http://localhost:8080/test?param1=value1&param2=value2";
        String actualUrl = Utils.getUrl(request);

        Assertions.assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testGetUrlWithoutQueryString() {
        Mockito.when(request.getRequestURL()).thenReturn(new StringBuffer("http://localhost:8080/test"));
        Mockito.when(request.getQueryString()).thenReturn(null);

        String expectedUrl = "http://localhost:8080/test";
        String actualUrl = Utils.getUrl(request);

        Assertions.assertEquals(expectedUrl, actualUrl);
    }
}
