package com.example.inventarsystem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

final logger 

@RestController
public class helloController{

  // this is a Request for GET
  @RequestMapping()
  public String hello(){
    int a = 2+2;
    return "Hello World" + a;
  }

}
