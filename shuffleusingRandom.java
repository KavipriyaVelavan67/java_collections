import java.util.*;
public class shuffleusingRandom{
      public static void main(String[]args){
		  
	   List<String>l= new ArrayList<String>();
	   
	   l.add("Rose");
	   l.add("Lily");
	   l.add("Jasmine");
	   l.add(1,"Sunflower");
	   l.add("Marie gold");
	   l.add("Dariya");
	   l.add(2,"Lotus");
	   
	  // System.out.println(l);
	  System.out.println("After shuffling ");
	   
	   Iterator i = l.iterator();
	   
	   while(i.hasNext()){
		   System.out.println(i.next());
	   }
	   
	  
	  Random r = new Random();
	  
	  for(int j=l.size()-1;j>=0;j--)
	  {
		  Collections.swap(l,j,r.nextInt(j+1));
	  }
	  
	  
	  System.out.println("After shuffling ");
	  
	  i = l.iterator();
	   
	   while(i.hasNext()){
		   System.out.println(i.next());
	      }
	  
	  }
}