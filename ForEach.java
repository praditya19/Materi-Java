public class ForEach {

    public void printElements(int[] list) {
        for (int element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        ForEach obj1 = new ForEach();
        int[] a = new int[5];
        a[0] = 2;
        a[1] = 8;
        a[2] = 13;
        a[3] = 27;
        a[4] = 60;
        obj1.printElement(a);

        // original array
        int[] myArray = { 1, 2, 3, 4, 5, 6 };

        // new larger array
        int[] hold = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        // copy all of the myArray array to the hold
        // array, starting with the 0th index
        System.arraycopy(myArray, 0, hold, 0, myArray.length);

        System.out.println("myArray");
        System.out.println(myArray);
        System.out.println("hold");
        System.out.println(hold);
    }
}