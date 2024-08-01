package com.sameer.oauth.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")

public class TestController {
public ResponseEntity<String> sayHi(){
    return ResponseEntity.ok("Hi from OAuth2.0");
}

}
