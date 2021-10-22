package Project3;
import java.util.*;

//Stack program showing different in built functions in it
public class StackClass {

	public static void main(String[] args) {
		//creating an instance of Stack class  
		Stack<Integer> stk= new Stack<>();  
		// checking stack is empty or not  
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		// pushing elements into stack  
		stk.push(78);  
		stk.push(113);  
		stk.push(90);  
		stk.push(120);
		//prints elements of the stack 
		System.out.println("Elements in Stack: " + stk);
		stk.add(2, 540);
		 
		System.out.println("Elements in stack after adding 540 at index 2 " + stk);
		stk.pop(); //to remove immediately next element
		System.out.println("Elements after applying pop(): " + stk);
		result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  

	}

}
