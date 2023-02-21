package com.niit.config;

import com.niit.domain.Movie;
import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public Movie createMovie(){
        return new Movie("Maverick","8","1.6B$",123);
    }

}
