package basics;

public class Student {
		
			String name;
			int age;   
			boolean isMale;  
			String address;
			
			public Student(){
			 System.out.println("Default Constructor");
			}		
			
			
			public Student(String sname) {
				System.out.println("Constructor with 1 parameter");
				name = sname;
			}
			//---------------------------------
			public Student(int sage,String sname) {
				System.out.println("Constructor with 2 parameters");
				name = sname;
				age = sage;
			}
			//-----------------------

}
