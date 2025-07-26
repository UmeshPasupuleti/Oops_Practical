
package Oops_practical;
import java.util.*;

public class operator {
	public static void main(String args[]) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("type a no:");
		x = sc.nextInt();
		System.out.println("type a no:");
		y = sc.nextInt();
		int sum = x + y;
		int dif = x - y;
		int mod = x % y;
		int pro = x * y;
		int div = x / y;
		System.out.println("sum="+sum);
		System.out.println("dif="+dif);
		System.out.println("pro="+pro);
		System.out.println("div="+div);
		System.out.println("mod="+mod);
	}
}
