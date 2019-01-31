package com.silur.studentorder;


import com.silur.studentorder.domain.*;
import com.silur.studentorder.mail.MailSender;
import com.silur.studentorder.validator.ChildrenValidator;
import com.silur.studentorder.validator.CityRegisterValidator;
import com.silur.studentorder.validator.StudentValidator;
import com.silur.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        while (true) {
            StudentOrder so = readStudentOrder();

            if (so == null) {
                break;
            }
            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.success) {

                break;
            }
            AnswerWedding answerWedding = checkWedding(so);
            AnswerChildren answerChildren = checkChildren(so);
            AnswerStudent answerStudent = checkStudent(so);
            sendMail(so);

        }
    }

    static void sendMail(StudentOrder studentOrder) {
        new MailSender().sendMail(studentOrder);
    }

    static StudentOrder readStudentOrder() {
        return new StudentOrder();
    }

    static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        CityRegisterValidator validator1 = new CityRegisterValidator();
        validator1.hostName = "Host1";
        validator1.login = "login1";
        validator1.password = "password1";
        AnswerCityRegister ans1 = validator1.checkCityRegister(studentOrder);
        return ans1;
    }

    static AnswerWedding checkWedding(StudentOrder studentOrder) {
        WeddingValidator weddingValidator = new WeddingValidator();
        return weddingValidator.checkWedding(studentOrder);
    }

    static AnswerChildren checkChildren(StudentOrder studentOrder) {
        ChildrenValidator childrenValidator = new ChildrenValidator();
        return childrenValidator.checkChildren(studentOrder);
    }

    static AnswerStudent checkStudent(StudentOrder studentOrder) {
        StudentValidator studentValidator = new StudentValidator();
        return studentValidator.checkStudent(studentOrder);
    }

}
