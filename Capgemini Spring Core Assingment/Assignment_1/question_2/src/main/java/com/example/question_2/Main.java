package com.example.question_2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SpringBootApplication
public class Main {

    private static List<Question> questionList;
    private static Map<String,Question> questionMap;
    private static Set<Question> questionSet;

    public static List<Question> returnList()
    {
        return questionList;
    }
    public static Set<Question> returnSet()
    {
        return questionSet;
    }
    public static Map<String,Question> returnMap()
    {
        return questionMap;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println();

        Questions questions = applicationContext.getBean("list",Questions.class);
        questionList = questions.getQuestionList();
        returnList().forEach(System.out::println);
        System.out.println();
        questions = applicationContext.getBean("set",Questions.class);
        questionSet = questions.getQuestionSet();
        Iterator iterator = questionSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println();
        questions = applicationContext.getBean("map",Questions.class);
        questionMap = questions.getQuestionMap();

        iterator = questionMap.entrySet().iterator();
        while (iterator.hasNext())
        {
            System.out.println("Key : "+iterator.next());
        }
    }

}
