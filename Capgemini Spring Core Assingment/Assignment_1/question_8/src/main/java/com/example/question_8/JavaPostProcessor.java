package com.example.question_8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JavaPostProcessor {
    @PostConstruct
    public void preInitMethod()
    {
        System.out.println("postInitMethod called");
    }
    @PreDestroy
    public void preDestroyMethod()
    {
        System.out.println("PreDestroyMethod called");
    }
}
