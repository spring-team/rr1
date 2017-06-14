package com.atomist.rr1;

import org.junit.RestService;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootRestService;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootRestService(classes = RestServiceApplication.class)
@WebAppConfiguration
public class RestServiceApplicationRestServices {

    @RestService
    public void contextLoads() {
    }
}
