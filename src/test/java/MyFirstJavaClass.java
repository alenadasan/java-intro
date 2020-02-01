public class MyFirstJavaClass {

    public static void main(String[] args) {

        System.out.println("Hello World\n");

        String name = "Andreea";
        System.out.println(name);

        int x = 10;
        int y = 20;
        int suma = x + y;

        System.out.println(suma);

        System.out.println("Suma este" + sum(2, 3));
        System.out.println("Suma este" + sum(10, 3));
        System.out.println("Suma este" + sum(2020, 3));

    }

    public static int sum(int a, int b) {
        int s = a + b;

        return s;
    }
}
