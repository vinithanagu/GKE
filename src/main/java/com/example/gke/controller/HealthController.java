package com.example.gke.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

  @RequestMapping(path = "/health", method = RequestMethod.GET)
  public ResponseEntity<?> getAppHealth(){
    return ResponseEntity.ok("I am ok");
  }
}
