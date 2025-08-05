package Oops_practical;

class box{
	double width;
	double height;
	double depth;
	void volume(){
		System.out.println(width * height * depth);
	}
}

public class object {
public static void main(String args[]) {
	box mybox = new box();
	double vol;
	mybox.depth = 10;
	mybox.height = 20;
	mybox.width = 30;
	vol = mybox.depth * mybox.height * mybox.width;
	System.out.println("Volume is "+vol);
}
}
