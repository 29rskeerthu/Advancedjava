package ArrayList;

public class isNullOrEmpty {
	
	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }

	    public static void main(String[] args) {
	        String test1 = null;
	        String test2 = "   ";
	        String test3 = "Hello";

	        System.out.println("Test1: " + isNullOrEmpty(test1)); // true
	        System.out.println("Test2: " + isNullOrEmpty(test2)); // true
	        System.out.println("Test3: " + isNullOrEmpty(test3)); // false
	    }
	}


