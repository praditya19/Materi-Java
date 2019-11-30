import java.util.ArrayList;

class LatihanLoppingPrima {
    public static void main(String[] args) {

        ArrayList<Integer> prima = new ArrayList<>();
        ArrayList<Integer> genap = new ArrayList<>();
        ArrayList<Integer> ganjil = new ArrayList<>();

        ArrayList<Integer> kabisatYear = new ArrayList<>();

        int initialValue = 1;
        int limitValue = 397;
        boolean isPrima;

        int initialYear = 400;
        int lastYear = 2004;

        for (int i = initialValue; i <= limitValue; i++) {
            isPrima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
            }
            if (isPrima == true && i != 1) { // to select the primes number
                prima.add(i);
            }
            if (i % 2 == 0) { // to select the even number
                genap.add(i);
            }
            if (i % 2 == 1) { // to select the odd number
                ganjil.add(i);
            }
        }

        while (initialYear <= lastYear) { // to select kabisat year
            if (initialYear % 4 == 0) {
                kabisatYear.add(initialYear);
            }
            initialYear++;
        }

        System.out.println("Prima = " + prima);
        System.out.println("=============================================\n");
        System.out.println("Genap = " + genap);
        System.out.println("=============================================\n");
        System.out.println("Ganjil = " + ganjil);
        System.out.println("\n=============================================");
        System.out.println("This is Kabisar Part");
        System.out.println("=============================================");
        System.out.println("Tahun Kabisat = " + kabisatYear);

    }
}