package c02.classes;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee.companyName = "ShiftEd Training";

        Employee firstEmployee = new Employee();
        firstEmployee.setName("John Doe");
        firstEmployee.setAge(30);
        firstEmployee.setJobTitle("Shef");
        firstEmployee.setSalary(300.25);
        firstEmployee.increaseSalary();

        System.out.println("First employee");
        firstEmployee.printEmployee();


        Employee secondEmployee = new Employee("James Brown", "Musician");

        System.out.println("\nSecond employee");
        secondEmployee.printEmployee();
    }
}
