package arraylistexample;
import java.util.*;
public class SortColors {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

	        System.out.println("Unsorted Colors: " + colors);
	        Collections.sort(colors);
	        System.out.println("Sorted Colors: " + colors);
	    }
	}
