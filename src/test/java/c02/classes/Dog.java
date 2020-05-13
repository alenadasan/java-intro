package c02.classes;

public class Dog {

    String breed;
    int age;
    String color;
    String name;

    public void setName(String dogName) {
        name = dogName;
    }

    public String getName() {
        return name;
    }

    public void talk() {
        System.out.println("bow wow");
    }

    public void sleep() {
        System.out.println("zzz");
    }
}