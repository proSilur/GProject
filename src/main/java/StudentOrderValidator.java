public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
//        while (true) {


        StudentOrder so = readStudentOrder();

        if (so == null) {
            return;
        } else {
            AnswerCityRegister cityAnswer = checkCityRegister(so);
            AnswerWedding answerWedding = checkWedding(so);
            AnswerChildren answerChildren = checkChildren(so);
            AnswerStudent answerStudent = checkStudent(so);
            sendMail(so);
        }
//        }
    }

    static void sendMail(StudentOrder studentOrder) {

    }

    static StudentOrder readStudentOrder() {
        return new StudentOrder();
    }

    static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        return CityRegisterValidator.checkCityRegister(studentOrder);
    }

    static AnswerWedding checkWedding(StudentOrder studentOrder) {
        return WeddingValidator.checkWedding(studentOrder);
    }

    static AnswerChildren checkChildren(StudentOrder studentOrder) {
        return ChildrenValidator.checkChildren(studentOrder);
    }

    static AnswerStudent checkStudent(StudentOrder studentOrder) {
        return StudentValidator.checkStudent(studentOrder);
    }


}
