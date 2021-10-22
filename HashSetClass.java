package Project3;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.*;
	
	//Program Uses keys() method to get Enumeration of Keys of the Hashtable

public class HashSetClass {
	
	public static void main(String[] args) {
	Hashtable ht = new Hashtable();
	ht.put("1", "One");
	ht.put("2", "Two");
	ht.put("3", "Three");
	ht.put("4", "Four");
	ht.put("5", "Five");
	ht.put("6", "Six");
	ht.put("7", "Seven");
	Enumeration e = ht.keys();
	
		      
	while (e.hasMoreElements()) {
		System.out.println(e.nextElement());
		      }
	
	
     
	}
	
}

	


