package references;


interface Sayable1{  
	void say();  
}  
public class InstanceReference {  
	public void saySomething(){  
		System.out.println("Hello, this is non-static method.");  
	}  
	public static void main(String[] args) {  
		InstanceReference methodReference = new InstanceReference(); // Creating object  
		// Referring non-static method using reference  
		Sayable sayable = methodReference::saySomething;  
		// Calling interface method  
		sayable.say();  
		// Referring non-static method using anonymous object  
		Sayable sayable2 = new InstanceReference()::saySomething; // You can use anonymous object also  
		// Calling interface method  
		sayable2.say();  
	}  
}  
