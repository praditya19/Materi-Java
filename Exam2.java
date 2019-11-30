public class Exam2 {

    String state = "";
    int Tahun = 0;
    String Merk = "";
    int Kecepatan = 0;
    int kurangi_Kecepatan = 0;

    void changeState(String newValue) {
        state = newValue;
    }

    void changeTahun(int newValue) {
        Tahun = newValue;
    }

    void changeMerk(String newValue) {
        Merk = newValue;
    }

    void changeKecepatan(int newValue) {
        Kecepatan = newValue;
    }

    void Kecepatan(int increment) {
        Kecepatan = Kecepatan + increment;
    }

    void Tambah_Kecepatan(int descrement) {
        Kecepatan = Kecepatan + descrement;
    }

    void printStates() {
        System.out.println("State :" + state);
        System.out.println("Tahun :" + Tahun);
        System.out.println("Merk :" + Merk);
        System.out.println("Kecepatan :" + Kecepatan);
    }
}
