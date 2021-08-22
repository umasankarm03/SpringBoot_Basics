package com.learning.restDB;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@Service
@RestController
public class ConfigSample {

    @Bean(name = "sample")
    public AnnotaionsSample annotaionsSample(){

        return new AnnotaionsSample();
    }
}
