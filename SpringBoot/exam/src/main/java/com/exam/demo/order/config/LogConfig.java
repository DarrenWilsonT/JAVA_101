package com.exam.demo.order.config;

import com.exam.demo.order.entity.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LogConfig {
    private static final Logger LOG = LoggerFactory.getLogger(LogConfig.class);

    @Bean
    public Order logMethod(){
        LOG.info("===================print log====================");
        return new Order();
    }
}
