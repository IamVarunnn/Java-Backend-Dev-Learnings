package com.telusko.SpringAIApp1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;

@Configuration
public class AppConfig {

    @Bean
    public JedisConnectionFactory redisConnectionFactory() {

        RedisStandaloneConfiguration config =
                new RedisStandaloneConfiguration("localhost", 6379);

        return new JedisConnectionFactory(config);
    }
}