import java.util.*;
import java.io.*;
public class Example1ofstack{
   public static void main(String[]args){
   
          Stack<Integer> s = new Stack<Integer>();
		
		  s.push(21);
		  s.push(1);
		  s.push(19);
		  s.push(20);
		  s.push(80);
		  s.push(9);  
		  
		  System.out.println(s);
		  System.out.println(s.peek());
		  s.pop();
		  System.out.println(s);
		  
   }
}
