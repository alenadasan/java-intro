package oopdemoclasses;

public class OOPDemoMain {

    public static void main(String[] args) {

        Employee firstEmployee = new Employee();
        firstEmployee.setName("John Doe");
        firstEmployee.setAge(30);
        firstEmployee.setJobTitle("Shef");
        firstEmployee.setSalary(300.25);

        firstEmployee.printEmployee();

        double newSalary = firstEmployee.increaseSalary();

        System.out.println(newSalary);

    }
}
