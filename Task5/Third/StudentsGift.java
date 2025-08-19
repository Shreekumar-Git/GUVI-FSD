package Task5.Third;
import java.util.*;
import java.util.stream.*;
public class StudentsGift {


	    public static void main(String[] args) {
	    
	        List<String> students = Arrays.asList(
	                "Arun", "Rahul", "Anita", "Priyanka", "Ajay",
	                "Sneha", "Akash", "Vikram", "Meenakshi"
	        );

	        List<String> specialStudents = students.stream()
	                                               .filter(name -> name.startsWith("A"))
	                                               .collect(Collectors.toList());

	   
	        System.out.println("Students who will get special gifts: " + specialStudents);
	    }
	

}
