// public class SwitchDemo {
//     public static void main(String[] args) {

//         int month = 8;
//         String monthString;
//         switch (month) {
//         case 1:
//             monthString = "January";
//             break;
//         case 2:
//             monthString = "February";
//             break;
//         case 3:
//             monthString = "March";
//             break;
//         case 4:
//             monthString = "April";
//             break;
//         case 5:
//             monthString = "May";
//             break;
//         case 6:
//             monthString = "June";
//             break;
//         case 7:
//             monthString = "July";
//             break;
//         case 8:
//             monthString = "August";
//             break;
//         case 9:
//             monthString = "September";
//             break;
//         case 10:
//             monthString = "October";
//             break;
//         case 11:
//             monthString = "November";
//             break;
//         case 12:
//             monthString = "December";
//             break;
//         default:
//             monthString = "Invalid month";
//             break;
//         }
//         System.out.println(monthString);
//     }
// }

public class SwitchDemoFallThrough {

    public static void main(String[] args) {
        java.util.ArrayList<String> futureMonths = new java.util.ArrayList<String>();

        int month = 8;

        switch (month) {
        case 1:
            futureMonths.add("January");
        case 2:
            futureMonths.add("February");
        case 3:
            futureMonths.add("March");
        case 4:
            futureMonths.add("April");
        case 5:
            futureMonths.add("May");
        case 6:
            futureMonths.add("June");
        case 7:
            futureMonths.add("July");
        case 8:
            futureMonths.add("August");
        case 9:
            futureMonths.add("September");
        case 10:
            futureMonths.add("October");
        case 11:
            futureMonths.add("November");
        case 12:
            futureMonths.add("December");
            break;
        default:
            break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }
        }
    }
}