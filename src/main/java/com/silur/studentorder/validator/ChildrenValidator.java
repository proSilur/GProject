package com.silur.studentorder.validator;

import com.silur.studentorder.domain.AnswerChildren;
import com.silur.studentorder.domain.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder studentOrder) {
        System.out.println("checkChildren is running");
        return new AnswerChildren();
    }
}
