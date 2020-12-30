package com.example.test.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService service){
        this.greetingService = service;
    }

    @RequestMapping("/greeting")
    public @ResponseBody String greeting(){
        return greetingService.greet();
    }

}
