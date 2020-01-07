package com.eduonix.eduonixbackend.controller;

import java.util.Calendar;
import com.eduonix.eduonixbackend.model.*;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {

    @RequestMapping(value = "/api/getDate", method = RequestMethod.GET)
    public String getDate() {
        return Calendar.getInstance().getTime().toString();
    }
    @RequestMapping(value="/api/getUser", produces = MediaType.APPLICATION_JSON_VALUE)
    public User requestMethodName() {
        return new User(7,"lucas");
    }    

}