import java.lang.Math;

public class NilaiBesarKecil {

    public static void main(String[] args) {
        int angka1, angka2, angka3, angka4, angka5, maks;
        angka1 = 1;
        angka2 = 3;
        angka3 = 5;
        angka4 = 7;
        angka5 = 10;

        maks = Math.max(angka1, angka2);
        if (angka5 > maks) {
            maks = angka5;
        }
        System.out.println("Angka maksimum adalah= " + maks);
    }
}