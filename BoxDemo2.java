package Oops_practical;



public class BoxDemo2 {
public static void main(String args[]) {
	box mybox1 = new box();
	box mybox2 = new box();
	mybox1.depth = 10;
	mybox1.height = 20;
	mybox1.width = 30;
	
	mybox2.depth = 20;
	mybox2.height = 30;
	mybox2.width = 40;
	double v1 = mybox1.depth * mybox1.height * mybox1.width;
	double v2 = mybox2.depth * mybox2.height * mybox2.width;
	System.out.println("Volume of box 1 is "+v1);
	System.out.println("Volume of box 2 is "+v2);
}
}
