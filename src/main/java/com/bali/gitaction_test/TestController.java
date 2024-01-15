package com.bali.gitaction_test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public ResponseEntity<String> test(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello~");
    }

    @GetMapping("/hi/{message}")
    public ResponseEntity<String> test (@PathVariable String message){
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }

}
