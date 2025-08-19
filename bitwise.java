package Oops_practical;
import java.util.*;

public class bitwise {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int x,y,z;
	System.out.println("enter a num:");
	x = sc.nextInt();
	System.out.println("enter a num:");
	y = sc.nextInt();
	z= x & y;
	System.out.println("And Operator:"+z);
	z = x | y;
	System.out.println("Or Operator:"+z);
}
}
