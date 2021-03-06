package com.kinger.homeinventory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckHttpResponseTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void shouldPassOpeningScreen() {
        assertEquals("Welcome to our family", testRestTemplate.getForObject("http://localhost:" + port + "/inStock", String.class));
    }

    @Test
    public void shouldPassIfNothingInStock() {
        assertEquals("Nothing in stock", testRestTemplate.getForObject("http://localhost:" + port + "/inStock", String.class));
    }
}
