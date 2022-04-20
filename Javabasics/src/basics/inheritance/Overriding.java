package basics.inheritance;

public class Overriding extends Vehicle {
	void run(){System.out.println("Bike is running safely");} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an instance of child class  
		Overriding obj = new Overriding();  
		//calling the method with child class instance  
		obj.run();  
	}  
}

