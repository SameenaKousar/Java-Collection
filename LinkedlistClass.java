package Project3;
import java.util.*;

//Linkedlist program using different in built functions in it
public class LinkedlistClass {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>(); 
		//adding elemets to list
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        ll.add("Anuj");  
        ll.add("Gaurav"); 
        System.out.println("Initial list of elements: "+ll);  
        ll.remove("Vijay");  //removing elements from list
        System.out.println("After removing vijay: "+ll); 
        ll.remove(0);  //remove element from perticular position
        System.out.println("After removing '0' index value: "+ll);  
        ll.removeFirst();  //remove first element
        System.out.println("After removing first element: "+ll);  
        ll.removeLast();  //remove last element
        System.out.println("After removing last element: "+ll);  
        ll.clear();  //clear the list
        System.out.println("After clearing list: "+ll);   

	}

}
