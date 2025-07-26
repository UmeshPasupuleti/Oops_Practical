package Oops_practical;
import java.util.*;

public class inc {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int x,y;
	
	System.out.println("enter a no:");
	x = sc.nextInt();
	System.out.println("enter a no:");
	y = sc.nextInt();
	System.out.println("given values:"+x+" "+y);
	int result1 = ++x;
	int result2 = --y;
	System.out.println("inc:"+result1+" "+"\n1dec:"+result2);
	}
}
