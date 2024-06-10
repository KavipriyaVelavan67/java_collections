import java.util.*;
public class Reverselist{
      public static void main(String[]args){
		  
	   List<String>l= new ArrayList<String>();
	   
	   l.add("Rose");
	   l.add("Lily");
	   l.add("Jasmine");
	   l.addFirst("Sunflower");
	   l.add("Marie gold");
	   l.addLast("Dariya");
	   l.add(2,"Lotus");
       System.out.println(l);	
	  
	     for(int i=l.size()-1;i>=0;i--){
			 
			  System.out.println(l.get(i));	
		 }
	   
	  }
}	  