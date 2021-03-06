package com.ivoronline.springboot_controller_annotation_restcontroller.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @RequestMapping("/Hello")
  public String hello() {
    return "Hello from Controller";
  }

}
