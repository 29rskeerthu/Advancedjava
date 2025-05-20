package Stringexciseprogram;

public class CapitalizeWords {
	
	    public static String capitalizeWords(String str) {
	        if (str == null || str.isEmpty()) return str;

	        String[] words = str.trim().split("\\s+");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            result.append(Character.toUpperCase(word.charAt(0)))
	                  .append(word.substring(1).toLowerCase()).append(" ");
	        }

	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        String input = "java programming language";
	        System.out.println("Capitalized: " + capitalizeWords(input));
	    }
	}


