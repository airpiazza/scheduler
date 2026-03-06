package com.airpiazza.scheduler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebPageController {
    @GetMapping(path = "/home")
    public String getHome() {
        return "home";
    }
}