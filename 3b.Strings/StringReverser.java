package ArrayList;

public class StringReverser {
	
	    public static String reverseString(String str) {
	        if (str == null) return null;
	        return new StringBuilder(str).reverse().toString();
	    }

	    public static void main(String[] args) {
	        String input = "AIET";
	        System.out.println("Reversed: " + reverseString(input));
	    }
	}


