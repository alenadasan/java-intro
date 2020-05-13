package c02.methods;

public class MathUtils {

    public static int magicNumber = 2020;

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public long add(long i, long j) {
        return i + j;
    }

    public int squareOf(int a) {
        int square = a * a;
        return square;
    }

    public static void displayMagicNumber() {
        System.out.println(magicNumber);
    }

    public double getRandomNumber() {
        return Math.random();
    }
}
