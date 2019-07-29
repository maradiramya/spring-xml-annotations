package com.stackroute.domain;

import com.stackroute.BeanLifecycleDemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")

public class BeanConfig {
//@Bean(name="movie")
//    public Movie movie1() {
//        Movie movie = new Movie();
//        return movie;
//    }

    @Bean
    public Actor actor() {
        Actor actor = new Actor("ramya", "female", 23);

        return actor;
    }

    @Bean
    public Actor actor1() {
        Actor actor1 = new Actor("abc", "male", 24);
        return actor1;
    }

    @Bean
    public Actor actor2() {
        Actor actor2 = new Actor("xyz", "female", 25);
        return actor2;
    }

    @Bean
    public BeanLifecycleDemoBean beanLifecycleDemoBean() {
        BeanLifecycleDemoBean bean = new BeanLifecycleDemoBean();
        return bean;
    }
}
