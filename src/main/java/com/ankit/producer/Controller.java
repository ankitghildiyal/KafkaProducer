package com.ankit.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ProducerService producerService;

    @PostMapping("/message")
    public void postMessage(@RequestBody Message payload){
        producerService.publish(payload);
    }
}
