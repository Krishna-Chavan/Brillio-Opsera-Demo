package com.brillio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {

    @GetMapping("/")
    String Return(){
        return "Welcome to Opsera Brillio Demo pipeline";
    }
}
