package main;

import   java.util.*;

public class LinkedLists {

	public static void main(String args[]) {
		
		System.out.println("Write a Java program to append the specified element to the end of a linked list.");
		
	     LinkedList<String> l_list = new LinkedList<String>();
	     l_list.add("Red");
	     l_list.add("Green");
	     l_list.add("Black");
	     System.out.println("The linked list: " + l_list+ "\n");

	
	     System.out.println("Write a Java program to iterate through all elements in a linked list.");
	    for (String item : l_list) {
			System.out.println(item);
		}
	    l_list.add(1, "apple");
		System.out.println(l_list);
		System.out.println("Write a Java program to insert elements into the linked list at the first and last position.");
		l_list.addFirst("pink");
		l_list.addLast("rose");
		System.out.println(l_list);

		l_list.offerFirst("first");
		System.out.println(l_list);
		
		System.out.println(l_list.getFirst());
		System.out.println(l_list.getLast());
		
		l_list.removeLast();
		l_list.removeFirst();
		System.out.println(l_list);
		
//		l_list.removeAll(l_list);
//		System.out.println(l_list);

		Collections.swap(l_list, 2, 3);
		System.out.println(l_list);

		Collections.shuffle(l_list);
		System.out.println(l_list);
		
		l_list.set(2, "grey");
		System.out.println(l_list);

		l_list.isEmpty();
		l_list.contains("grey");
		
		l_list.peekFirst();
		l_list.pop();

	}
}
