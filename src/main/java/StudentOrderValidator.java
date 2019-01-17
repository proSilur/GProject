public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        StudentOrder so = readStudentOrder();

        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWedding answerWedding = checkWedding(so);
        AnswerChildren answerChildren = checkChildren(so);
        AnswerStudent answerStudent = checkStudent(so);

        sendMail(so);
    }

    static void sendMail(StudentOrder studentOrder) {

    }

    static StudentOrder readStudentOrder() {
        return new StudentOrder();
    }

    static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        System.out.println("checkCityRegister is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }

    static AnswerWedding checkWedding(StudentOrder studentOrder) {
        System.out.println("checkWedding is running");
        return new AnswerWedding();
    }

    static AnswerChildren checkChildren(StudentOrder studentOrder) {
        System.out.println("checkChildren is running");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder studentOrder) {
        System.out.println("checkStudent is running");
        return new AnswerStudent();
    }


}
