public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.hFirstName = "Alex";
        so.hLastName = "Petrov";
        so.wFirstName = "Galina";
        so.wLastName = "Petrova";
    }

    static void saveStudentOrder() {
        System.out.println("saveStudentOrder");
    }
}
