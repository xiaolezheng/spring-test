package com.lxz.aspect;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Service
public class DefaultFooService implements FooService {

    public String getFoo(String fooName, int age) {
        try{
            TimeUnit.MILLISECONDS.sleep(100);
        }catch (Exception e){
            // ignore
        }
        return "[name: " + fooName + "|" + age + "]";
    }
}
