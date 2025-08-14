package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @ResponseBody
    @GetMapping("/")
    public String index(){
        return "sbb";
    }

    @GetMapping("/hello")
    public void hello(){
        System.out.println("hello 메서드 호출됨!");
    }
}
