import java.util.*;

class Vehicle{
	
      int wheels;
      String model;
      String type;
	  String name;
	  int price;
	  
	/*Vehicle(String w, String m, String t, String n, String p){
		  
		  this.wheels = wheels;
		  this.model = model;
		  this.type = type;
		  this.name = name;
		  this.price = price;
		 
	  }*/
	  
       public void setwheel(int wheels){
		   this.wheels = wheels;
	   }
	   public int getwheel(){
		   return wheels;
	   }
	   
	   public void setmodel(String model){
		   this.model = model;
	   }
	   public String getmodel(){
		   return model;
	   }
	   
	   public void settype(String type){
		   this.type = type;
	   }
	   public String gettype(){
		   return type;
	   }
	   
	   public void setname(String name){
		   this.name = name;
	   }
	   public String getname(){
		   return name;
	   }
	   
	   public void setprice(int price){
		   this.price = price;
	   }
	   public int getprice(){
		   return price;
	   }
	     
}

public class Objectlist{
    public static void main(String[]args){
		
	Vehicle v = new Vehicle();
	List<Object>l=new ArrayList<>();
	
	v.setwheel(4);
	v.setmodel("1980");
	v.settype("Car");
	v.setname("Ambassodor");
	v.setprice(100000);
	
	l.add(v.getwheel());
	l.add(v.getmodel());
	l.add(v.gettype());
	l.add(v.getname());
	l.add(v.getprice());
	
	System.out.print(l);	
		
	}
}