package com.biswa.springbootsample.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")

public class Hello {

    Hello(){
        System.out.println("hello Class:" + this.toString());
    }

    public void myMethod(){
        System.out.println("Called myMethod");
    }

}

