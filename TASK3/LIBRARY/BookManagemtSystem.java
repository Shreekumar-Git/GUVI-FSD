package Task3;
import java.util.Scanner;

public class BookManagemtSystem {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Library library = new Library();

	        while (true) {
	            System.out.println("\n--- Library Menu ---");
	            System.out.println("1. Add Book");
	            System.out.println("2. Replace Book");
	            System.out.println("3. Display All Books");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Book ID: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine(); // consume newline

	                    System.out.print("Enter Title: ");
	                    String title = scanner.nextLine();

	                    System.out.print("Enter Author: ");
	                    String author = scanner.nextLine();

	                    Book book = new Book(id, title, author);
	                    library.addBook(book);
	                    break;

	                case 2:
	                    System.out.print("Enter Book ID to replace: ");
	                    int bookID = scanner.nextInt();
	                    scanner.nextLine();

	                    System.out.print("Enter new Title: ");
	                    String newTitle = scanner.nextLine();

	                    System.out.print("Enter new Author: ");
	                    String newAuthor = scanner.nextLine();

	                    library.replaceBook(bookID, newTitle, newAuthor);
	                    break;

	                case 3:
	                    library.displayBooks();
	                    break;

	                case 4:
	                    System.out.println("Exiting program.");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    
	}
}

