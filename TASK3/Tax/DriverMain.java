package Task_3;
import java.util.Scanner;

public class DriverMain {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Employee input
	        System.out.println("Enter Employee Details:");
	        System.out.print("Employee ID: ");
	        int empId = scanner.nextInt();
	        scanner.nextLine(); 
	        System.out.print("Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Monthly Salary: ");
	        double salary = scanner.nextDouble();

	        Employee emp = new Employee(empId, name, salary);

	        // Product input
	        System.out.println("\nEnter Product Details:");
	        System.out.print("Product ID: ");
	        int pid = scanner.nextInt();
	        System.out.print("Price: ");
	        double price = scanner.nextDouble();
	        System.out.print("Quantity: ");
	        int quantity = scanner.nextInt();

	        Product prod = new Product(pid, price, quantity);

	        // Tax calculations
	        System.out.println("\n--- Tax Calculations ---");
	        emp.calcTax();
	        prod.calcTax();

	        scanner.close();
	    }
	}


