package TASK4.second;

	import java.util.Scanner;

	public class VoterMain {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter Voter ID: ");
	            int voterId = sc.nextInt();
	            sc.nextLine(); // clear buffer

	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Age: ");
	            int age = sc.nextInt();

	            Voter voter = new Voter(voterId, name, age);
	            System.out.println("\n--- Voter Details ---");
	            voter.display();

	        } catch (InvalidVoterAgeException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }

	        sc.close();
	    }
	}


