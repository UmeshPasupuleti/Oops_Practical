package Oops_practical;
import java.util.*;

public class concat {
public static void main(String ags[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter string 1:");
	String s1 = sc.next();
	System.out.print("enter string to concat with string 1:");
	String c1 = sc.next();
	s1 = s1.concat(c1);
	System.out.println("enter string 2:");
	String s2 = sc.next();
	System.out.print("enter string to concat with string 2:");
	String c2 = sc.next();
	  s2.concat(c2);
	System.out.println(s1 + " " + "immutability "+s2);
	s2 = s2.concat(c2);
	System.out.println("mutable "+s2);
}
}
