package c02.instructions;

import java.util.Arrays;
import java.util.List;

public class InstructionsDemo {

    public static void main(String[] args) {
        InstructionsDemo.checkStudentStatus(4.5);
        InstructionsDemo.checkStudentStatus(9.5);
    }

    public static void checkStudentStatus(double grade) {
        if(grade >= 5)
            System.out.println("pass");
        else
            System.out.println("fail");
    }

    public int getMaxValueFromList(List<Integer> values) {
        int max = values.get(0);

        for (Integer value : values) {
            if (value > max)
                max = value;
        }

        return max;
    }

    public void displayListContent() {
        List<String> names = Arrays.asList("Luke", "Leya", "Chewy");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        for (String name : names) {
            System.out.println(name);
        }
    }

}
