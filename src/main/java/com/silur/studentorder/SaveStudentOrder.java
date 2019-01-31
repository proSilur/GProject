package com.silur.studentorder;

import com.silur.studentorder.domain.Adult;
import com.silur.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();


        long ans = saveStudentOrder(so);

        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("StudentOrder: ");
        return answer;
    }

    static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        husband.setGivenName("Andrey");
        so.setHusband(husband);

        return so;
    }
}
