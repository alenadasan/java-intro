public class DemoMain {

    public static void main(String[] args) {

        Employee firstEmployee = new Employee();
        firstEmployee.setName("John Doe");
        firstEmployee.setAge(30);
        firstEmployee.setJobTitle("Shef");
        firstEmployee.setSalary(300.25);

        firstEmployee.printEmployee();

        double newSalary = firstEmployee.increaseSalary();

        System.out.println(newSalary);

//        System.out.println(firstEmployee.name);


//        List<Employee> employees = new ArrayList<Employee>();

//        employees.add(firstEmployee);




    }
}
