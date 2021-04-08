package com.example.question_10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextAwareTesting implements ApplicationContextAware , BeanNameAware {
    ApplicationContext applicationContext = null;
    public void run()
    {
        System.out.println("Running");
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
        System.out.println(applicationContext.getId());
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name : "+s);
    }
}
