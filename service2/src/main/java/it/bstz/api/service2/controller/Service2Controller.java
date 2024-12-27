package it.bstz.api.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("service2")
@RestController
public class Service2Controller {
    @GetMapping("/hello")
    public String service2() {
        return "Hello from service 2";
    }
}
