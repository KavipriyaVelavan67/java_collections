import java.util.*;
public class Linkedhashmap{
   public static void main(String[]args){
   
   Map<String,Integer> i = new LinkedHashMap<>();
   
   i.put("Vennila Icecream",2);
   i.put("Stawberry Icecream",4);
   i.put("Choclate Icecream",1);
   i.put("Fruit Salad",3);
   i.put("gulfi",5);
   i.put("falloda",6);
   
   System.out.println(i);

   System.out.println(i.get("Choclate Icecream"));

   System.out.println(i.containsKey("gulfi"));
   
   System.out.println(i.containsValue(7));   
   
      for(Map.Entry <String,Integer> me :i.entrySet()){
	         
	         String key = me.getKey();
			 
			 Integer value = me.getValue();
		
         System.out.println(value +" = "+key);		
      }
   }
}   