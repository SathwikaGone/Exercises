package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {
	
	public static void main(String args[] ) {
		
	       System.out.println("This is my first code");
	       Exercises obj = new Exercises();
	       System.out.println("Write a Java program to create a new array list, add some colors (string) and print out the collection.");
	       System.out.println(obj.displayList()+ "\n");
	       
	       System.out.println("Write a Java program to iterate through all elements in a array list.");
	       List<String> pList = obj.displayList();

//using for
//	       for (int i = 0; i < pList.size(); i++) {
//	    	   System.out.println(pList.get(i));
//	       }
	       
//Using foreach
	       for (String str : pList) {
			System.out.println(str);
	       }
	       System.out.println("\n");
	       
	       System.out.println("Write a Java program to insert an element into the array list at the first position");
	       pList.add(0, "yellow");
	       pList.add(0, "red");
	       pList.add(0, "black");
	       pList.add(0, "blue");

	       System.out.println(pList+ "\n");

	       System.out.println("Write a Java program to retrieve an element (at a specified index) from a given array list");
	       System.out.println(pList.get(1)+ "\n");

	       System.out.println("Write a Java program to update specific array element by given element");
	       pList.set(2, "gray");
	       System.out.println(pList + "\n");
	       
	       System.out.println("Write a Java program to remove the third element from a array list.");
	       pList.remove(2);
	       System.out.println(pList + "\n");
	
	       System.out.println("Write a Java program to search an element in a array list.");
	       System.out.println(pList.indexOf("pink")+ "\n");
	
	       System.out.println("Write a Java program to sort a given array list.");
	       System.out.println(pList);
	       Collections.sort(pList);
	       System.out.println(pList + "\n");
	       
	       System.out.println("Write a Java program to copy one array list into another.");
	       List<String> zList;
	       zList= new ArrayList<String>();
	       zList.add("jjj");
	       zList.add("jjj");
	       zList.add("jjj");
	       zList.add("jjj");
	       zList.add("jjj");
	       
	       System.out.println(zList );
	        Collections.copy(zList, pList);
	       System.out.println(zList + "\n");

	       System.out.println("Write a Java program to shuffle elements in a array list.");
	       Collections.shuffle(pList);
	       System.out.println(pList + "\n");

	       System.out.println("Write a Java program to reverse elements in a array list.");
	       Collections.reverse(pList);
	       System.out.println(pList + "\n");

	       System.out.println("Write a Java program to extract a portion of a array list");
	       System.out.println( pList.subList(0, 4)+ "\n");
	       
	       System.out.println(" Write a Java program to compare two array lists.");
	       System.out.println("zList"+zList);
	       System.out.println("pList"+pList);
	       System.out.println(pList.equals(zList)+ "\n");
	       
	       System.out.println("Write a Java program of swap two elements in an array list.");
	       Collections.swap(pList, 2, 4);
	       System.out.println(pList+ "\n");
	       
	       System.out.println(" Write a Java program to join two array lists.");
	       pList.addAll(zList);
	       System.out.println(pList+ "\n");
	       
//System.out.println("Write a Java program to clone an array list to another array list.");
//ArrayList<String> pArrayList = (ArrayList<String>) pList.clone();
	
	       System.out.println("Write a Java program to empty an array list.");
	       pList.removeAll(pList);
	       System.out.println(pList+ "\n");
           
	       System.out.println(" Write a Java program to test an array list is empty or not");
	       System.out.println(pList.isEmpty() + "\n");
    
	}

}
