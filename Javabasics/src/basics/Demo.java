package basics;

public class Demo {
	public static void main(String args[])
	{
		Student collegeStudent = new Student(); 
		collegeStudent.name = "Shreyas";
		System.out.println("Name of the student is "+collegeStudent.name);
		collegeStudent.age = 21;
		System.out.println("Student's age is "+collegeStudent.age);
		collegeStudent.isMale = true;
		if(collegeStudent.isMale == true)
			System.out.println("The gender of the student is Male");
		else
			System.out.println("The gender of the student is Female");
		collegeStudent.address = "Mangalore";
		System.out.println("The address of the student is "+collegeStudent.address);

	}
}

