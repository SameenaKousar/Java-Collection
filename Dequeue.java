package Project3;
import java.util.*;

//Java program to demonstrate the working of a Deque in Java

public class Dequeue {

	public static void main(String[] args) {
		
		Deque<String> deque
        = new LinkedList<String>();


    // Add at the last
    deque.add("Ajnali");

    // Add at the first
    deque.addFirst("Priyambada");

    // Add at the last
    deque.addLast("Riya");

    // Add at the first
    deque.push("Meena");

    // Add at the last
    deque.offer("Rahul");

    // Add at the first
    deque.offerFirst("Vikram");

    System.out.println(deque + "\n");

    // We can remove the first element
    // or the last element.
    deque.removeFirst();
    deque.removeLast();
    System.out.println("Deque after removing " + "first and last: " + deque);

	}

}
