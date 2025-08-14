package TASK4.Fifth;

	import java.util.Stack;
	import java.util.Scanner;

	public class IntegerStackDemo {

	    private Stack<Integer> stack = new Stack<>();

	    // a. Push element onto stack
	    public void pushElement(int element) {
	        stack.push(element);
	        System.out.println(element + " pushed to stack.");
	    }

	    // b. Pop element from stack
	    public void popElement() {
	        if (!stack.isEmpty()) {
	            int removed = stack.pop();
	            System.out.println(removed + " popped from stack.");
	        } else {
	            System.out.println("Stack is empty! Nothing to pop.");
	        }
	    }

	    // c. Check if stack is empty
	    public void checkEmpty() {
	        if (stack.isEmpty()) {
	            System.out.println("Stack is empty.");
	        } else {
	            System.out.println("Stack is not empty. Size: " + stack.size());
	        }
	    }

	    public static void main(String[] args) {
	        IntegerStackDemo demo = new IntegerStackDemo();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n--- Stack Menu ---");
	            System.out.println("1. Push element");
	            System.out.println("2. Pop element");
	            System.out.println("3. Check if stack is empty");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter integer to push: ");
	                    int num = sc.nextInt();
	                    demo.pushElement(num);
	                    break;
	                case 2:
	                    demo.popElement();
	                    break;
	                case 3:
	                    demo.checkEmpty();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
	
}
