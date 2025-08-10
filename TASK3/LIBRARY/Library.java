package Task3;

public class Library {
	
	    private Book[] books;
	    private int count; // track number of books added

	    public Library() {
	        this.books = new Book[5]; // fixed size
	        this.count = 0;
	    }

	    // Add a book
	    public void addBook(Book book) {
	        if (count < books.length) {
	            books[count] = book;
	            count++;
	            System.out.println("Book added successfully.");
	        } else {
	            System.out.println("Library is full. Cannot add more books.");
	        }
	    }

	    // Replace a book based on bookID
	    public void replaceBook(int bookID, String newTitle, String newAuthor) {
	        for (int i = 0; i < count; i++) {
	            if (books[i].getBookID() == bookID) {
	                books[i].setTitle(newTitle);
	                books[i].setAuthor(newAuthor);
	                System.out.println("Book details updated.");
	                return;
	            }
	        }
	        System.out.println("Book with ID " + bookID + " not found.");
	    }

	    // Display all books
	    public void displayBooks() {
	        if (count == 0) {
	            System.out.println("Library is empty.");
	            return;
	        }

	        System.out.println("Books in Library:");
	        for (int i = 0; i < count; i++) {
	            books[i].display();
	        }
	    }

	    // Optional: search book by ID
	    public Book searchBookById(int bookID) {
	        for (int i = 0; i < count; i++) {
	            if (books[i].getBookID() == bookID) {
	                return books[i];
	            }
	        }
	        return null;
	    }
	}

