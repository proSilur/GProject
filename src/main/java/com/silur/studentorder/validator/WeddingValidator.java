package com.silur.studentorder.validator;

import com.silur.studentorder.domain.AnswerWedding;
import com.silur.studentorder.domain.StudentOrder;

public class WeddingValidator {
    public AnswerWedding checkWedding(StudentOrder studentOrder) {
        System.out.println("checkWedding is running");
        return new AnswerWedding();
    }
}
