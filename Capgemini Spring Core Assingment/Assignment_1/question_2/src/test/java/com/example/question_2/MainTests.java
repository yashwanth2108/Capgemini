package com.example.question_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

class MainTests {

    @Test
    @BeforeEach
    void MainCalling() {
        String[] args = new String[0];
        Main.main(args);

    }

    @Test
    void CheckList()
    {
        List<Question> list = Arrays.asList(
                new Question(123125,"sky colour is bLue ?","Yes")
                ,new Question(123123,"Earth is round or flat ?","Earth is round")
                ,new Question(123126,"Apple Colour ?","is Red")
                ,new Question(123127,"Yoga is Beneficial ?","Yes, it is")
        );

        Assertions.assertEquals(list.toString(),Main.returnList().toString());
    }
    @Test
    void CheckSet()
    {
        Set<Question> set = new HashSet<Question>(Arrays.asList(
                new Question(123125,"sky colour is bLue ?","Yes")
                ,new Question(123123,"Earth is round or flat ?","Earth is round")
                ,new Question(123126,"Apple Colour ?","is Red")
                ,new Question(123127,"Yoga is Beneficial ?","Yes, it is")
        ));

        Set<Question> expected = set.stream().sorted( (p,q) -> p.getQuestionID()<q.getQuestionID() ? 1 : -1).collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Question> actual = Main.returnSet().stream().sorted( (p,q) -> p.getQuestionID()<q.getQuestionID() ? 1 : -1).collect(Collectors.toCollection(LinkedHashSet::new));
        Assertions.assertEquals(expected.toString(),actual.toString());
    }



}
