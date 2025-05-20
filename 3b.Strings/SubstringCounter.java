package ArrayList;

public class SubstringCounter {
	
	    public static int countOccurrences(String main, String sub) {
	        if (main == null || sub == null || sub.isEmpty()) return 0;

	        int count = 0, index = 0;
	        while ((index = main.indexOf(sub, index)) != -1) {
	            count++;
	            index += sub.length();
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String mainStr = "AIET is great. AIET is awesome. AIET!";
	        String subStr = "AIET";

	        System.out.println("Occurrences: " + countOccurrences(mainStr, subStr));
	    }
	}


