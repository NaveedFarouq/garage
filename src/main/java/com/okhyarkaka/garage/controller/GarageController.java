package com.okhyarkaka.garage.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GarageController {

    @GetMapping(path = "/")
    public String getNaswar() {
        return "naveed";
    }
}
