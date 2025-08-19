package Oops_practical;
import java.util.*;

public class sum_array {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.print("Enter n :");
	n = sc.nextInt();
	int a[] = new int[n];
	int sum = 0;
	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();
		sum = sum+ a[i];
	}
	int avg = sum/n;
	System.out.println("sum="+sum+" average="+avg);
}
}
