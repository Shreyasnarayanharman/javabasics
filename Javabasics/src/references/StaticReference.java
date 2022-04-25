package references;


interface Sayable{  
	void say();  
}  
public class StaticReference {  
	public static void saySomething(){  
		System.out.println("Hello, this is static method.");  
	}  
	public static void main(String[] args) {  
		// Referring static method  
		Sayable sayable = StaticReference::saySomething;  
		// Calling interface method  
		sayable.say();  
	}  
}  

