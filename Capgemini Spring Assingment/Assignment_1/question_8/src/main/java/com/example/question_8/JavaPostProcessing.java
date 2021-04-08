package com.example.question_8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JavaPostProcessing {
    private int objectId;

    public JavaPostProcessing(int objectId) {
        this.objectId = objectId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }


    public void initMethod()
    {
        System.out.println("initMethod called");
    }
    public void destroyMethod()
    {
        System.out.println("destroyMethod called");
    }

}
