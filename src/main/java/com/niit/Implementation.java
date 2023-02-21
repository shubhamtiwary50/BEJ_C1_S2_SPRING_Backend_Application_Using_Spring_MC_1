package com.niit;

import com.niit.config.BeanConfig;
import com.niit.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class Implementation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Movie movie = applicationContext.getBean(Movie.class);
        System.out.println(movie);
    }
}
