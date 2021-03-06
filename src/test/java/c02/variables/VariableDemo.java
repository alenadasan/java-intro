package c02.variables;

public class VariableDemo {

    public static void main(String[] args) {

        byte byteVar = 5;
        short shortVar = 20;
        int intVar = 30;

        long longVar = 60L;
        float floatVar = 20.0f;
        double doubleVar = 20.123d;

        boolean booleanVar = true;
        char charVar = 'W';

        String stringVar = "Hello";
        Integer myIntValue = 10;

        int sum = intVar + byteVar;

        System.out.println(sum);

        System.out.println(floatVar + doubleVar);

        System.out.println("Value of the byte variable is " + byteVar);
        System.out.println("Value of the short variable is " + shortVar);
        System.out.println("Value of the int variable is " + intVar);
        System.out.println("Value of the long variable is " + longVar);
        System.out.println("Value of the float variable is " + floatVar);
        System.out.println("Value of the double variable is " + doubleVar);
        System.out.println("Value of the boolean variable is " + booleanVar);
        System.out.println("Value of the char variable is " + charVar);
        System.out.println("Value of the String variable is " + stringVar);

        System.out.println(stringVar.charAt(0));
        System.out.println(myIntValue.compareTo(20));


        int val = 10;

        System.out.println("Square values");

        squareValue(val);
        squareValue(100);
        squareValue(1);
        squareValue(-100);
        squareValue(3000);
        squareValue(400000);
    }

    public static void squareValue(int val) {
        int square = val * val;

        System.out.println(square);
    }
}
