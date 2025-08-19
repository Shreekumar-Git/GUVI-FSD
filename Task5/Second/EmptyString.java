package Task5.Second;
import java.util.*;
import java.util.stream.Collectors;

public class EmptyString {
	

	    public static void main(String[] args) {
	        // Given list
	        List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

	        // Filtering non-empty strings
	        List<String> nonEmptyList = listStrings.stream()
	                                               .filter(s -> !s.isEmpty())
	                                               .collect(Collectors.toList());

	        // Printing result
	        System.out.println("List with non-empty strings: " + nonEmptyList);
	    }
	
}
