package Task_3;

public class Product implements Taxable {

	    private int pid;
	    private double price;
	    private int quantity;

	    public Product(int pid, double price, int quantity) {
	        this.pid = pid;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    @Override
	    public void calcTax() {
	        double tax = price * salesTax;
	        System.out.println("Sales Tax for product ID " + pid + " (Unit Price ₹" + price + "): ₹" + tax);
	    }
	}


