package lqx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LqxConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}
