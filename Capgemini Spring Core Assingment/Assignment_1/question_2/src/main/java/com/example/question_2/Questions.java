package com.example.question_2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Questions {
    private List<Question> questionList;
    private Map<String,Question> questionMap;
    private Set<Question> questionSet;


    public void setProperty(List property) {
        questionList=property;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setSetProperty(Set setProperty) {
        questionSet=setProperty;
    }

    public Map<String, Question> getQuestionMap() {
        return questionMap;
    }

    public Set<Question> getQuestionSet() {
        return questionSet;
    }

    public void setMapProperty(Map mapProperty) {
        questionMap=mapProperty;
    }
}
