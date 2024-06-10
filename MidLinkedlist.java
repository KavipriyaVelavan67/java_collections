import java.util.*;
public class MidLinkedlist{
      public static void main(String[]args){
		  
	   List<String>l= new LinkedList<String>();
	   
	   l.add("Rose");
	   l.add("Lily");
	   l.add("Jasmine");
	   l.addFirst("Sunflower");
	   l.add("Marie gold");
	   l.addLast("Dariya");
	   l.add(2,"Lotus");
	   l.add("Hibiscus");
	   
	   int m = l.size()/2;
	   
	   System.out.println(l);
       System.out.println(l.get(m));
	   
	   }
}	   
	   