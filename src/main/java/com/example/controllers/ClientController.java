package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by atsk1618 on 4/18/2017.
 */
public class ClientController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String show() {
        return "greeting"; // resources/templates/greeting.html
    }
}
