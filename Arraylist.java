import java.util.*;
public class Arraylist{
	public static void main(String[]args){
      
	  ArrayList <Integer> list1 = new ArrayList<>();
	  List <Integer> list2 = new ArrayList<>();
	  
	  //add 
	  list1.add(25);
	  list1.add(100);
	  list1.add(2,75);
	  
	  list2.add(0);
	  list2.add(99);
	  list2.add(999);
	  list2.add(9999);
	  
	  System.out.println("oldlist1 "+list1);
	  System.out.println("oldlist2 "+list2);
	  System.out.println();
	  
	  //adding elements b/w two numbers
	  list1.add(1,50);
	  
	  //replace or update
	  list2.set(0,9);
	  
	  System.out.println("Updated list1 "+list1);
	  System.out.println("Updated list2 "+list2);
	  
	  //remove
	  
	  list2.remove(0);
	  System.out.println("after removing an element: " + list2);
	  
	  //get
	  System.out.println(list1.get(1));
	  
	  //size
	  int n = list1.size();
	  System.out.println(n);
	  
	  //iterator
	  
	  for(int i=0;i<n;i++){
		  
		  System.out.println(list1.get(i));
	  }
	  
	  //foreach loop
	  
	  for( int i:list2){
		  System.out.println(i);
	  }
	  // copy one list to another list
	  list1.addAll(list2);
	  System.out.println("Before sorting: "+list1);
	  
	  //sort
	  Collections.sort(list1);
	  System.out.println("After sorting: "+list1);
	  
	  
	  
	}  
}