public class InterschimbareVariabile {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int aux;

        aux = a;   //aux = 5
        a = b;     //a = 10;
        b = aux;   //b = 5;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Valorile sunt: " + a + " si " + b);

    }


}
