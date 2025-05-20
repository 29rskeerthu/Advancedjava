package Stringexciseprogram;

public class NumericChecker {
	
	    public static boolean isNumeric(String str) {
	        return str != null && str.matches("\\d+");
	    }

	    public static void main(String[] args) {
	        String input1 = "123456";
	        String input2 = "123abc";
	        System.out.println("Input1 is numeric: " + isNumeric(input1)); // true
	        System.out.println("Input2 is numeric: " + isNumeric(input2)); // false
	    }
	}


