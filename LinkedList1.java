package first;

import java.util.*;

class LinkedList1 {
  public static void main(String args[]) {
	  // Linked List declaration
	  LinkedList<Integer> ll = new LinkedList<Integer>();
	  
	  // Adding elements to the list
	  ll.add(22);
	  ll.add(5);
	  ll.add(56);
	  
	  // Printing elements in the list
	  System.out.println("Initial list of elements: "+ll); 
	  
	  // Removing elements from the list
	  
	  
	  // Iterating through the list
	  Iterator<Integer> itr= ll.iterator();
	  while(itr.hasNext()) {
		  System.out.println(itr.next());
	  }
	  
	  // Adding elements at specific location
	  ll.add(1,69);
	  System.out.println("Initial list of elements: "+ll); 
	  
	  LinkedList<Integer> ll2 = new LinkedList<Integer>();
	  ll2.add(44);
	  ll2.add(18);
	  
	  // Adding all the elements of second linked list
	  ll.addAll(ll2);
	  System.out.println("Initial list of elements: "+ll); 
	  
	  // Removing examples
	  ll.remove(1);
	  ll.removeFirstOccurrence(ll);
	  ll.removeLast();
	  System.out.println("Initial list of elements: "+ll); 
	  
	  // Reversing a list
	  Iterator i = ll.descendingIterator();
	  while(i.hasNext()) {
		  System.out.println(i.next());
	  }
	  
	  // Clearing list\
	  ll.clear();
	  System.out.println( ll );
  }
}