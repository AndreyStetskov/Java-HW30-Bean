package com.crazyemperor.homework30bean.something;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SomeController {

    @Autowired
    SomeService service;

    @GetMapping(value = "/bean")
    public String getString() {
        return service.getMessage();
    }
}
