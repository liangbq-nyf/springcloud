package com.example.consumer.service.impl;

import com.example.consumer.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerServiceImpl implements IConsumerService {

    @Value("${model.produce.name}")
    private String produceName;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getProduceInfo() {
        String str = restTemplate.getForObject("http://"+produceName+"/producer?name="+"中国话",String.class);
        return str;
    }
}
