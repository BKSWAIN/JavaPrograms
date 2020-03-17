package com.biswa.springbootsample.controller;


import com.biswa.springbootsample.service.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/root")
public class SampleController {

    @Value("${sampleapp.prop1}")
    String prop1;

    @Autowired
    Hello hello1;

    @Autowired
    Hello hello2;

//    @GetMapping("/hello")
//    public ResponseEntity receiveGetData(@RequestBody String data, HttpServletRequest request){
//        System.out.println("Prop1 is: "+ prop1);
//
//        return new ResponseEntity("Hello"+data+"\n"+prop1, HttpStatus.OK);
//    }


    @PostMapping("/hello")
    public ResponseEntity receiveData(@RequestBody String data, HttpServletRequest request){
        //System.out.println("Prop1 is: "+ prop1);

        hello1.myMethod();

        return new ResponseEntity("Hello"+data+"\n"+prop1, HttpStatus.OK);
    }

    @PostMapping("/hello/{variable}")
    public ResponseEntity receiveData1(@RequestBody String data,@PathVariable String variable, HttpServletRequest request){


        return new ResponseEntity("Hello "+data + " " +variable, HttpStatus.OK);
    }



}
