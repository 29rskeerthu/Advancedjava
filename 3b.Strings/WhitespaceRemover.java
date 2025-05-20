package ArrayList;

public class WhitespaceRemover {
	
	    public static String removeWhitespace(String str) {
	        if (str == null) return null;
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        String input = "  A I E T   College  ";
	        System.out.println("Without whitespace: '" + removeWhitespace(input) + "'");
	    }
	}


