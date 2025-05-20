package arraylistexample;
import java.util.*;
public class RemoveNthColor {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Purple"));
	        int n = 3; // Example: remove 3rd index (4th element)

	        System.out.println("Original Colors: " + colors);
	        if (n >= 0 && n < colors.size()) {
	            colors.remove(n);
	            System.out.println("After removing element at index " + n + ": " + colors);
	        } else {
	            System.out.println("Invalid index.");
	        }
	    }
	}
