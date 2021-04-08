package com.example.question_5;

import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;
import javax.inject.Named;

@Named
public class Rectangle {
    private int length;
    private int breath;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }
    public void setBreath(int breath) {
        this.breath=breath;
    }
}
