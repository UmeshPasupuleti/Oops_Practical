package Oops_practical;
import java.util.*;

public class SearchIndex {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter a string:");
	String s = sc.next();
	String index = sc.next();
	int indexof = s.indexOf(index);
	System.out.print("enter a substring to check its last occurence:");
	String lo = sc.next();
	int last = s.lastIndexOf(lo);
	System.out.print("enter a substring to check if it is present or not:");
	String o= sc.next();
	boolean occurence = s.contains(s);
	System.out.println(s + " "+indexof + " " + last + " "+occurence);
	sc.close();
	
}
}
