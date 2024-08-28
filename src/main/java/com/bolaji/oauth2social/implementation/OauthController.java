package com.bolaji.oauth2social.implementation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/oauth")
public class OauthController {



    @GetMapping("/test")
    public ResponseEntity<String> login(){
        return ResponseEntity.ok("Login Successfully");
    }
    
}
