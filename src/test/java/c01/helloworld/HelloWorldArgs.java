package c01.helloworld;

public class HelloWorldArgs {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}