package com.lxz.aspect;

public class DefaultFooService implements FooService {

    public String getFoo(String fooName, int age) {
        return "[name: " + fooName + "|" + age + "]";
    }
}
