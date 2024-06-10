import java.util.*;
public class Copylist{
   public static void main(String[]args){
	   
	   List<String>l= new ArrayList<String>();
	   
	   l.add("Pink");
	   l.add("Yellow");
	   l.add("Orange");
	   System.out.println(l);
	   
	   List<String >l2=new ArrayList<>();
	   l2.add("purple");
	   l2.add("Pista green");
	   l2.add("Olive green");
	   l2.add("Blue");
	   System.out.println(l2);
	  
	   l2.addAll(l);
	   
	  for(String i:l2){
		    System.out.println(i);
	   }
   }
}