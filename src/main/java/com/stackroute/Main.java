package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.BeanConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Movie movie = (Movie) context.getBean("movieComponent");
        System.out.println(movie);
        Movie movie1=(Movie)context.getBean("movieComponent");
        System.out.println(movie==movie1);


        Actor actor1 = (Actor) context.getBean("actor1");
        Actor actor2 = (Actor) context.getBean("actor2");

        System.out.println(actor1);
        System.out.println(actor2);
         context.close();

    }

}
