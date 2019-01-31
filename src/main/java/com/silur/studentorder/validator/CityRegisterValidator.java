package com.silur.studentorder.validator;

import com.silur.studentorder.domain.AnswerCityRegister;
import com.silur.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    public String login;
    public String password;

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        System.out.println("checkCityRegister is running: " + hostName + ", " + login + ", " + password);
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
