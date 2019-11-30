public class TestMyDate {
 		public static void main(String[] args) {
 			MyDate my_birth = new MyDate(22, 7, 2000);
 			MyDate the_next_week = my_birth.addDays(8).addMount(3).addYears(19);
			
 			System.out.println(the_next_week);
 		}
 	}