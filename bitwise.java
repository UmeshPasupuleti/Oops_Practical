package Oops_practical;
import java.util.*;

public class bitwise {
public static void main(System args[]) {
	Scanner sc = new Scanner(System.in);
	int x,y,z;
	System.out.println("enter a no:");
	x = sc.nextInt();
	System.out.println("enter a no:");
	y = sc.nextInt();
	z= x & y;
	System.out.println("And Operator:"+z);
	z = x | y;
	System.out.println("Or Operator:"+z);
}
}
