public class Employee {

    String name;
    int age;
    String title;
    double salary;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int empAge) {
        age = empAge;
    }

    public void setJobTitle(String empTitle) {
        title = empTitle;
    }

    public void setSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmployee() {
        System.out.println("Name:"+ name );
        System.out.println("Age:" + age );
        System.out.println("Job title:" + title);
        System.out.println("Salary:" + salary);
    }

    protected double increaseSalary() {
        double raise = salary * 1.1;

        return raise;
    }
}
