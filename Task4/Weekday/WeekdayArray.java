package TASK4.Third;

	import java.util.Scanner;

	public class WeekdayArray {
	    public static void main(String[] args) {
	        String[] weekdays = {
	            "Sunday", "Monday", "Tuesday", 
	            "Wednesday", "Thursday", "Friday", "Saturday"
	        };

	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter day position (0 for Sunday, 6 for Saturday): ");
	            int index = sc.nextInt();

	            System.out.println("Day is: " + weekdays[index]);

	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Please enter a valid index between 0 and 6.");
	        }

	        sc.close();
	    }
	}


