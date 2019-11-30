import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> prima = new ArrayList<Integer>();
        ArrayList<Integer> genap = new ArrayList<Integer>();
        ArrayList<Integer> ganjil = new ArrayList<Integer>();

        int bilangan = Integer.parseInt(args[0]);
        int[] a = new int[bilangan];
        boolean isPrima;

        for (int i = 2; i < a.length; i++) {
            isPrima = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
            }

            if (isPrima == true && i != 1) {
                prima.add(i);
            }
        }

        for (int i = 2; i < a.length; i++) {
            if (i % 2 == 0) {
                genap.add(i);
            }
        }

        for (int i = 1; i < a.length; i++) {
            if (i % 2 == 1) {
                ganjil.add(i);
            }
        }
        System.out.println("Prima  : " + prima);
        System.out.println("Genap  : " + genap);
        System.out.println("Ganjil : " + ganjil);
    }
}