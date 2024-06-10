import java.util.*;
public class Middleelement{
      public static void main(String[]args){
		  
	   List<String>l= new ArrayList<String>();
	   
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
	   
	   //for(int i=0;i>list.size()/2;i++)
	  
	     /*for(int i=l.size()-1;i>=0;i--){
			 
			  System.out.println(l.get(i));	
		 }*/
	   
	  }
}	  