package Stringexciseprogram;
import java.util.Random;
public class RandomStringGenerator {
	
	
	    public static String generateRandomString(int length) {
	        if (length <= 0) return "";

	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        Random random = new Random();
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < length; i++) {
	            result.append(chars.charAt(random.nextInt(chars.length())));
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        System.out.println("Random String: " + generateRandomString(10));
	    }
	}


