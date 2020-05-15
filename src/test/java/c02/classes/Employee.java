package c02.classes;

public class Employee {

    String name;
    int age;
    String title;
    double salary;
    static String companyName;

    public Employee() {
    }

    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
    }

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
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Job title:" + title);
        System.out.println("Salary:" + salary);
        System.out.println("Company name: " + companyName);
    }

    public double increaseSalary() {
        salary = salary + 0.1 * salary;

        return salary;
    }
}
