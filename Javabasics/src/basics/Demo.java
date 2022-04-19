package basics;

public class Demo {
	public static void main(String args[])
	{
		
		Student collegeStudent = new Student(); 
		
		
		
		System.out.println("The name of the Student is "+collegeStudent.name);
		System.out.println("The age of the Student is "+collegeStudent.age);
		
		Student javaStudent = new Student("Shreyas");
		System.out.println("The name of the Student is "+javaStudent.name);
		
		Student cjavaStudent = new Student(22,"Shreyas");
		System.out.println("The name of the Student is "+cjavaStudent.name);
		System.out.println("The age of the Student is "+cjavaStudent.age);
			
		}

	}



