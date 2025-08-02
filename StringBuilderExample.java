package Oops_practical;
import java.util.*;

public class StringBuilderExample {
public static void main(String args[]) {
	StringBuilder sb1 = new StringBuilder("hello");
	StringBuilder sb2 = new StringBuilder("hello");
	StringBuilder sb3 = new StringBuilder("hello");
	StringBuilder sb4 = new StringBuilder("hello");
	StringBuilder sb5 = new StringBuilder("hello");
	sb1.append("World");
	sb2.insert(5," Java ");
	sb3.delete(1,4);
	sb4.replace(0,4,"Hl");
	sb5.reverse();
	  System.out.println("append" +"  "+sb1);  // Output varies
      System.out.println("insert" +"  " +sb2); 
      System.out.println("delete" +"  " +sb3); 
      System.out.println("replace" +"  " +sb4); 
      System.out.println("reverse" +" " +sb5); 
}
}
