package com.silur.studentorder.validator;

import com.silur.studentorder.domain.AnswerStudent;
import com.silur.studentorder.domain.StudentOrder;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder studentOrder) {
        System.out.println("checkStudent is running");
        return new AnswerStudent();
    }
}
