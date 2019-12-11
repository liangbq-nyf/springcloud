package com.example.consumer.service.impl;

import com.example.consumer.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerServiceImpl implements IConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getProduceInfo() {
        String str = restTemplate.getForObject("http://PRODUCER/producer?name="+"中国话",String.class);
        return str;
    }
}
