package ArrayList;
import java.util.LinkedList;
public class InsertAtEnd {
	
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");

	        // Insert element at the end
	        list.offerLast("Pink");

	        System.out.println("Linked list after inserting at the end:");
	        for (String color : list) {
	            System.out.println(color);
	        }
	    }
	}


