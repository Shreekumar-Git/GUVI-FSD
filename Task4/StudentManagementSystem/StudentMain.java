package TASK4;

	import java.util.Scanner;

	public class StudentMain {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter Roll No: ");
	            int rollNo = sc.nextInt();
	            sc.nextLine(); // clear buffer

	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Age: ");
	            int age = sc.nextInt();
	            sc.nextLine(); // clear buffer

	            System.out.print("Enter Course: ");
	            String course = sc.nextLine();

	            Student s = new Student(rollNo, name, age, course);
	            System.out.println("\n--- Student Details ---");
	            s.display();

	        } catch (AgeNotWithinRangeException | NameNotValidException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }

	        sc.close();
	    }
	}


