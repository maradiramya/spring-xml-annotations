package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")
public class BeanConfig {
//    @Bean
//    public Movie movie() {
//        Movie movie = new Movie();
//        return movie;
//    }

    @Bean
    public Actor actor() {
        Actor actor = new Actor();
        actor.setName("ramya");
        actor.setAge(23);
        actor.setGender("female");
        return actor;
    }
}
