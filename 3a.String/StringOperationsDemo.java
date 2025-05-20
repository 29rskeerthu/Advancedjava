package ArrayList;
import java.util.Scanner;
public class StringOperationsDemo {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("String Creation: " + str1 + " " + str2);

	        // Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

	        // String Comparison
	        System.out.println("Comparing str1 and str2: " + str1.equals(str2));
	        System.out.println("Comparing str1 and 'Hello': " + str1.equals("Hello"));

	        // String Searching
	        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));
	        System.out.println("Last index of 'l' in str1: " + str1.lastIndexOf('l'));

	        // Substring Operations
	        System.out.println("Substring of str1 from index 1: " + str1.substring(1));
	        System.out.println("Substring of str1 from index 1 to 3: " + str1.substring(1, 3));

	        // String Modification
	        String modifiedStr1 = str1.replace('l', 'p');
	        System.out.println("Modified str1 (replace 'l' with 'p'): " + modifiedStr1);

	        // Whitespace Handling
	        String strWithSpaces = "   Hello World   ";
	        System.out.println("Trimmed string: '" + strWithSpaces.trim() + "'");

	        // String Concatenation
	        String concatenatedStr = str1 + " " + str2;
	        System.out.println("Concatenated String: " + concatenatedStr);

	        // String Splitting
	        String strToSplit = "apple,banana,cherry";
	        String[] fruits = strToSplit.split(",");
	        System.out.println("Fruits after splitting:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // StringBuilder Demo
	        StringBuilder stringBuilder = new StringBuilder("Hello");
	        stringBuilder.append(" World");
	        System.out.println("StringBuilder content: " + stringBuilder.toString());

	        // String Formatting
	        String formattedString = String.format("Formatted String: %s %s", str1, str2);
	        System.out.println(formattedString);

	        // Validate Email
	        System.out.print("Enter an email address to validate: ");
	        String email = scanner.nextLine();
	        if (email.contains("@") && email.contains(".") && email.startsWith("user") && email.endsWith(".com")) {
	            System.out.println("Valid email address.");
	        } else {
	            System.out.println("Invalid email address.");
	        }

	        scanner.close();
	    }
	}


