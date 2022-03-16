package io.amargher.apps.helloappinsights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloAppinsightsApplication {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, App Insights!";
    }


    public static void main(String[] args) {
        SpringApplication.run(HelloAppinsightsApplication.class, args);
    }

}
