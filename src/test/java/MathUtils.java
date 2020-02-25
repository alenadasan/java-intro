public class MathUtils {

    public static int magicNumber = 2020;

    public static long add(long i, long j) {
        return i + j;
    }

    public static void main(String[] args) {
        long result = MathUtils.add(100L, 50L);

        System.out.println(result);
        System.out.println(MathUtils.magicNumber);
    }

}
