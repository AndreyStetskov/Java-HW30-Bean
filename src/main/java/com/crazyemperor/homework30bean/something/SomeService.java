package com.crazyemperor.homework30bean.something;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "example")
public class SomeService {

    public String getMessage() {
        return "JAVA";
    }
}
