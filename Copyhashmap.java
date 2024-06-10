import java.util.*;
public class Copyhashmap{
   
   public static void main(String[]args){
        
    Map<Integer,String> m = new HashMap<>();
	
	
	m.put(1,"Kavya");
	m.put(7,"heera");
	m.put(2,"Navin");
	m.put(11,"Priya");
	m.put(12,"Shobi");

	//System.out.println(m);
	System.out.println(m.size());
	m.remove(12);
 
    Map<Integer,String> m1= new HashMap<>();
	
	m1.putAll(m);
    
	Set s = m.keySet();
    System.out.println(s);
	
	
	System.out.println(m.values());
	
   }
}