package Stringexciseprogram;

public class WordCounter {
	
	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) return 0;
	        return str.trim().split("\\s+").length;
	    }

	    public static void main(String[] args) {
	        String input = "AIET is a premier institution";
	        System.out.println("Word count: " + countWords(input));
	    }
	}


