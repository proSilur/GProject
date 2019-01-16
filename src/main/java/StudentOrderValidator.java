public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkCityRegister() {
        System.out.println("checkCityRegister is running");
    }

    static void checkWedding() {
        System.out.println("Wedding is running");

    }

    static void checkChildren() {
        System.out.println("Children is running");
    }

    static void checkStudent() {
        System.out.println("Студенты is running");
    }

    static void checkAll() {
        checkCityRegister();
        checkWedding();
        checkChildren();
        checkStudent();
    }
}
