package com.zlst.activiti;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/hi")
    public String hi() {

        return " ni hao a !";
    }
}
