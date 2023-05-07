package com.consumerdirect.partnercalculationservice;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Component
public class ExampleController {

    @Value("${db.url}")
    private String urlValue;

    @GetMapping("/message")
    public String getMessage() {
        return "Get controller accessed I'm going to tell you value of the url: "+urlValue;
    }

}