package Oops_practical;
class Vehicle{
	int maxSpeed = 100;
}
class car extends Vehicle{
	int maxSpeed = 180;
	void display() {
		System.out.println("max speed:"+super.maxSpeed);
	}
}
class bike extends Vehicle{
	int maxSpeed = 200;
	void display() {
		System.out.println("max speed:"+super.maxSpeed);
	}
}

public class superrKey {
public static void main(String args[]) {
	bike b = new bike();
	b.display();
	car c = new car();
	c.display();
}
}
