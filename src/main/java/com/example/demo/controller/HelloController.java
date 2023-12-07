package com.example.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@RequestMapping("/")
@RestController
public class HelloController {

    @GetMapping("/connect")
    public String hello(@RequestParam(value = "name", defaultValue = "Server API") String name) {
        return String.format("Connected %s!", name);
    }

    @GetMapping("/getJson")
    public ResponseEntity<JsonNode> getJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode json = mapper.readTree("{\"id\": \"132\", \"name\": \"Alice\"}");
        return ResponseEntity.ok(json);
    }

    @GetMapping("/getString")
    public ResponseEntity<?> getString() {
        return ResponseEntity.ok("I am a new comer!");
    }

    @GetMapping("/hello")
    public ResponseEntity<?> helloHandler(@RequestParam(value = "name", defaultValue = "Sophat Chhay") String name) {
        return ResponseEntity.ok(String.format("Hello %s!", name));
    }
}
