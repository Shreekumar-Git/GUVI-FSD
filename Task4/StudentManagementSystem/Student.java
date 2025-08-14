package TASK4;


	public class Student {
	    private int rollNo;
	    private String name;
	    private int age;
	    private String course;

	    public Student(int rollNo, String name, int age, String course)
	            throws AgeNotWithinRangeException, NameNotValidException {
	        this.rollNo = rollNo;

	        // Validate name
	        if (!name.matches("[a-zA-Z\\s]+")) { // only letters and spaces allowed
	            throw new NameNotValidException("Name is not valid: only alphabets and spaces are allowed.");
	        }
	        this.name = name;

	        // Validate age
	        if (age < 15 || age > 21) {
	            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
	        }
	        this.age = age;

	        this.course = course;
	    }

	    public void display() {
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Course: " + course);
	    }
	}


