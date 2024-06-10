import java.util.*;
public class Arraylistcolors{
   public static void main(String[]args){
	   
	   List<String>l= new ArrayList<String>();
	   
	   l.add("Pink");
	   l.add("Yellow");
	   l.add("Orange");
	   
	  boolean iscolor = l.contains("Orange");
	   
	   if(iscolor){
		   System.out.println("the element is available");
	   }
	   else{
		   System.out.println("the element is not available");
	   }
	   
   }
}