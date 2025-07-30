package com.codeio.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/h")
    String sayHelloWorld() {
        return "Hello World!";
        //Representational State Transfer - REST
    }
}
