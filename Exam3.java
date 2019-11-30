import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // int pilih = input.nextInt();

        int pilih = Integer.parseInt(args[0]);
        switch (pilih) {
        case 1:
            int a = Integer.parseInt(args[1]);
            System.out.print("panjang : " + a + " ");
            int b = Integer.parseInt(args[2]);
            System.out.print("lebar : " + b + " ");
            int c = Integer.parseInt(args[3]);
            System.out.print("tinggi : " + c);
            int d = a * b * c;
            System.out.println("");
            System.out.println("==========================");
            System.out.println("Volume Balok  = " + d);
            break;

        case 2:
            double r = Double.parseDouble(args[1]);
            System.out.print("rusuk1 : " + r + " ");
            double g = Double.parseDouble(args[2]);
            System.out.print("rusuk2 : " + g + " ");
            double e = Double.parseDouble(args[3]);
            System.out.print("rusuk3 : " + e + " ");
            double h = r * g * e;
            System.out.println("");
            System.out.println("==========================");
            System.out.println("Volume Kubus = " + h);
            break;

        case 3:
            System.out.print("Masukan jari-jari : ");
            r = input.nextInt();
            h = r * r * r * 3.14 * 4 / 3;
            System.out.println("");
            System.out.println("==========================");
            System.out.println("Luas Lingkaran = " + h);
            break;

        default:
            System.out.println("Angka Salah");
        }
        input.close();
    }
}
