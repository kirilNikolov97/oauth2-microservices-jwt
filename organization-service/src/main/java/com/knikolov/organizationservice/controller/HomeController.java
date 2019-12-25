package com.knikolov.organizationservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test() {
        return "test";
    }

    @RequestMapping(value = "/test", method = RequestMethod.DELETE)
    String delete() {
        return "delete from ADMIN";
    }

}
