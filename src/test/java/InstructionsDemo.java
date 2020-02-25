public class InstructionsDemo {

    public static void checkStudentStatus(double grade) {
        if(grade >= 5)
            System.out.println("pass");
        else
            System.out.println("fail");
    }

    public static void main(String[] args) {
        InstructionsDemo.checkStudentStatus(4.5);
        InstructionsDemo.checkStudentStatus(9.5);
    }
}
