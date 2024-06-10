import java.util.*;
public class hashmap{
	public static void main(String[]args){

    Map<Integer,String> m = new HashMap<>();
	
	
	m.put(1,"Kavya");
	m.put(7,"heera");
	m.put(2,"Navin");
	m.put(11,"Priya");
	m.put(12,"Shobi");
	
	System.out.println(m);
	System.out.println(m.size());
	
	if(m.containsKey(2)){
		
		String s = m.get(2);
		System.out.println(s);
	}
	else{
		System.out.println("The value is not in the map");
	}
	
	}
}
