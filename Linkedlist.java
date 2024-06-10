import java.util.*;
public class Linkedlist{
   public static void main(String[]args){
   
          List<String> l = new LinkedList<>();
		  
		  l.add("apple");
		  l.add("orange");
		  l.add("mango");
		  l.add("jackfruit");
		  
		  l.addFirst("melon");
		  l.addLast("papaya");
		  System.out.println(l);
		  
		  System.out.println(l.getFirst());
		  System.out.println(l.getLast());
		  
		  l.removeFirst();
		  l.removeLast();
		  
		  System.out.println(l);
		  
   
   }

}