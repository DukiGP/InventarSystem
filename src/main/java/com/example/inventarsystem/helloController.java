package com.example.inventarsystem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController{

  // this is a Request for GET
  @RequestMapping()
  public String hello(){
    return "Hello World";
  }

}
