package com.example.consumer.controller;

import com.example.consumer.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private IConsumerService consumerService;


    @RequestMapping(value = "/consumer")
    public String getInfo(){
        String str = consumerService.getProduceInfo();
        return str;
    }
}
