package Oops_practical;
import java.util.*;

public class smalll_array {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.print("Enter n :");
	n = sc.nextInt();
	int a[] = new int[n];
	int small = 0;
	int big = 0;
	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();
		if(i==0) {
			small = a[i];
			big = a[i];
		}
		else {
			if(a[i] <small) {
				small = a[i];
			}
			else if(a[i] > big) {
				big = a[i];
			}
		}
	}
	System.out.println("small="+small+" big="+big);
}
}
