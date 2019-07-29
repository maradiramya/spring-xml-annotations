package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("movieComponent")
@Scope("prototype")

public class Movie {

    @Autowired
    Actor actor;


    public Movie() {
    }

    public Movie(Actor actor)
    {
        this.actor = actor;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }


}
