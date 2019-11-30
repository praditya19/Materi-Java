public class LatihanVar {
    public static String myStaticVar = "Static variable disini";
    String myInstanceVar = "Instance variable 1 disini";

    public static void main(String args[]) {
        LatihanVar obj3 = new LatihanVar();
        LatihanVar obj4 = new LatihanVar();

        // All three will display "Static variable disini"
        System.out.println(LatihanVar.myStaticVar);
        System.out.println(LatihanVar.myStaticVar);

        // One will display "Instance variable 1 disini"
        System.out.println(obj3.myInstanceVar);

        // changing the value of static variable using obj4
        obj4.myInstanceVar = "Instance variable 2 disini";

        // will display "Instance variable 2 disini"
        System.out.println(obj4.myInstanceVar);
    }
}