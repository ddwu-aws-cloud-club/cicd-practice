package com.cicd.acccicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConroller {

    @GetMapping("/test")
    public String test(){
        return "성공";
    }
}
