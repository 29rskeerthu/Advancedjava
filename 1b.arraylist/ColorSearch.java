package arraylistexample;
import java.util.*;
public class ColorSearch {
	

	
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

	        System.out.println("Colors: " + colors);
	        if (colors.contains("Red")) {
	            System.out.println("\"Red\" is available in the list.");
	        } else {
	            System.out.println("\"Red\" is not available in the list.");
	        }
	    }
	}


