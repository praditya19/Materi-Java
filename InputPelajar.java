public class InputPelajar {

    public static void main(String[] args) {
        String[] nama = { "Ardi", "Pian", "Robi" };
        double[][] nil = { { 60, 70, 90 }, { 80, 70, 90 }, { 70, 60, 90 } };
        double nilai = 0;

        System.out.println("+-------+-------+-------+-------+---------------+");
        System.out.println("| Nama\t|  UTS\t|  UAS\t| TUGAS\t|  NILAI AKHIR\t|");
        System.out.println("+-------+-------+-------+-------+---------------+");

        for (int row = 0; row < 3; row++) {
            System.out.print("|" + nama[row] + "\t|");
            for (int coloum = 0; coloum < 3; coloum++) {
                System.out.print(nil[row][coloum] + "\t|");
            }
            nilai = (0.35 * nil[row][0]) + (0.45 * nil[row][1]) + (0.2 * nil[row][2]);
            System.out.println(nilai + "\t\t|");
        }

        System.out.println("+-------+------+------+--------+----------------+");
    }
}