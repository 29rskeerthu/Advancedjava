package ArrayList;
import java.util.LinkedList;
public class DisplayElementsWithPositions {
	
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");
	        list.add("Orange");

	        System.out.println("Elements and their positions:");

	        for (int i = 0; i < list.size(); i++) {
	            System.out.println("Position " + i + ": " + list.get(i));
	        }
	    }
	}


