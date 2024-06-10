//Write a Java Program to Compare Two LinkedList.

import java.util.*;
public class Comparelist{
	public static void main(String[]agrs){
		
	 List<String> l = new LinkedList<>();
		  
		  l.add("apple");
		  l.add("orange");
		  l.add("mango");
		  l.add("jackfruit");
		  
		  l.addFirst("melon");
		  l.addLast("papaya");
		  System.out.println(l);
		  
     List<String> l2 = new LinkedList<>(); 
	      
		  l2.add("apple");
		  l2.add("orange");
		  l2.add("mango");
		  l2.add("jackfruit");
		  
		  l2.addFirst("melon");
		  l2.addLast("papaya");
		  System.out.println(l);

		//System.out.println(l==l2);
		
		 LinkedList<String> c3 = new LinkedList<String>();
		 
          for (String e : l1)
             c3.add(l2.contains(e) ? "Yes" : "No");
          System.out.println(c3);     
		
	}
}