package com.atomist.rr1;

import org.junit.RestService;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootRestService;
import org.springframework.boot.test.context.SpringBootRestService.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootRestService(classes = RestServiceApplication.class, webEnvironment = WebEnvironment.DEFINED_PORT)
public class RestServiceWebIntegrationRestServices {

    private static final int PORT = 8080;

    // Parameterize tests like this
    private static final String AN_APP_PATH = "http://localhost:" + PORT + "/path";

    // Use this to run tests
    private RestTemplate restTemplate = new RestTemplate();

    @RestService
    public void sampleRestService() {
    // Use RestTemplate to hit chosen URLs
    }
}
