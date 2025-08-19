package Oops_practical;

public class default_constructor {
	public static void main(String args[]) 
	{
	 // declare, allocate, and initialize Box objects 
	 box mybox1 =   new box();
	 box mybox2 = new box(); 
	 double vol; 

	// get volume of first box 
	 vol = mybox1.volume();
	 System.out.println("Volume is " + vol);

	 // get volume of second box 
	 vol = mybox2.volume(); 
	 System.out.println("Volume is " + vol); 
	}
}
