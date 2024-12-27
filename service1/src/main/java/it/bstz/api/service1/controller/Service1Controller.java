package it.bstz.api.service1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("service1")
@RestController
public class Service1Controller {
    @GetMapping("/hello")
    public String service1() {
        return "Hello from service1";
    }
}
