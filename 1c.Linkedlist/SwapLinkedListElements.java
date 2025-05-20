package ArrayList;
import java.util.Collections;
import java.util.LinkedList;
public class SwapLinkedListElements {
	
	    public static void main(String[] args) {
	        // Create a LinkedList and add some elements
	        LinkedList<String> l_list = new LinkedList<>();
	        l_list.add("Element 1"); // Index 0
	        l_list.add("Element 2"); // Index 1
	        l_list.add("Element 3"); // Index 2
	        l_list.add("Element 4"); // Index 3
	        // Print the original list
	        System.out.println("Original LinkedList: " + l_list);
	        // Swap the first (index 0) and third (index 2) elements
	        Collections.swap(l_list, 0, 2);
	        // Print the modified list
	        System.out.println("LinkedList after swapping first and third elements: " + l_list);
	    }
	}


