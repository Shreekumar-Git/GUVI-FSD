// Discount System
import java.util.Scanner;
public class Main {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // purchase amount input
        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        double discount = 0;
        double finalAmount;

        // discount on purchase amount
        if (purchaseAmount < 500) {           // NO Discount
            discount = 0;
        } else if (purchaseAmount <= 1000) {
            discount = purchaseAmount * 0.10; // 10% discount
        } else {
            discount = purchaseAmount * 0.20; // 20% discount
        }

        finalAmount = purchaseAmount - discount;

        // Final Bill
        System.out.println("Purchase Amount: ₹" + purchaseAmount);
        System.out.println("Discount Applied: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + finalAmount);

        scanner.close();
    }
}
