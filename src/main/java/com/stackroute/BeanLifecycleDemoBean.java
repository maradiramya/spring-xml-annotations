package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanLifeCycle is created");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanLifeCycle is destroyed");
    }
@PostConstruct
    public void customInit() {
        System.out.println("the mathod is run through the init");

    }
@PreDestroy
    public void customDestroy() {
        System.out.println("Bean will be destroyed");
    }
}
