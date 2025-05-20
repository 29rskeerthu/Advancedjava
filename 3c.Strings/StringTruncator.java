package Stringexciseprogram;

public class StringTruncator {
	
	    public static String truncate(String str, int maxLength) {
	        if (str == null || maxLength < 0) return str;
	        return str.length() <= maxLength ? str : str.substring(0, maxLength) + "...";
	    }

	    public static void main(String[] args) {
	        String input = "Artificial Intelligence and Emerging Technologies";
	        System.out.println("Truncated: " + truncate(input, 20));
	    }
	}


