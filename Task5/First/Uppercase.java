package Task5.First;
import java.util.stream.Stream;
public class Uppercase {


	
	    public static void main(String[] args) {
	        // Given list as Stream
	        Stream<String> names = Stream.of("aBc", "d", "ef");

	       
	        names.map(String::toUpperCase)
	             .forEach(System.out::println);
	    }
}


