package c02.classes;

public class DogMain {

    public static void main(String[] args) {
        Dog firstDog = new Dog();

        firstDog.setName("Frank");
        System.out.println(firstDog.getName());

        firstDog.sleep();
    }
}
