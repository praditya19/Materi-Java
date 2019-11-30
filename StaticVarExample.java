public class StaticVarExample {
    public static String myClassVar = "class or static variable";

    public static void main(String args[]) {
        // StaticVarExample obj = new StaticVarExample();
        // StaticVarExample obj2 = new StaticVarExample();
        // StaticVarExample obj3 = new StaticVarExample();

        // All three will display "class or static variable"
        System.out.println(StaticVarExample.myClassVar);
        System.out.println(StaticVarExample.myClassVar);
        System.out.println(StaticVarExample.myClassVar);

        // changing the value of static variable using obj2
        StaticVarExample.myClassVar = "Changed Text";

        // All three will display "Changed Text"
        System.out.println(StaticVarExample.myClassVar);
        System.out.println(StaticVarExample.myClassVar);
        System.out.println(StaticVarExample.myClassVar);
    }
}