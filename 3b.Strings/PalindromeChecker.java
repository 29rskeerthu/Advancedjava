package ArrayList;

public class PalindromeChecker {
	
	    public static boolean isPalindrome(String str) {
	        if (str == null) return false;

	        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        String reversed = new StringBuilder(cleanStr).reverse().toString();
	        return cleanStr.equals(reversed);
	    }

	    public static void main(String[] args) {
	        String test1 = "Madam, in Eden, I’m Adam";
	        String test2 = "AIET";

	        System.out.println("Test1 is Palindrome: " + isPalindrome(test1)); // true
	        System.out.println("Test2 is Palindrome: " + isPalindrome(test2)); // false
	    }
	}


