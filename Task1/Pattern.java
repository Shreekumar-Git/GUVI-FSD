// Pattern
public class Main {
    
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 1; i <= n; i++) {
            // Print decreasing numbers starting from 5 down to (6 - i)
            for (int j = 5; j >= 6 - i; j--) {
                System.out.print(j);
            }
            // Print the last digit (6 - i) for the remaining columns
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(6 - i);
            }
            System.out.println(); // move to next line
        }
    }
}
