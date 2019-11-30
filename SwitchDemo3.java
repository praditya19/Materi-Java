class SwitchDemo3 {
    public static void main(String[] args) {
        int year = 2000;
        String numYear = "";

        switch (year) {
        case 0:
            System.out.println("Tahun biasa");
            break;

        default:
            if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                numYear = "Tahun kabisat";
            else
                numYear = "Tahun Hijriyah";

            break;
        }

        System.out.println(year + " adalah " + numYear);
    }
}