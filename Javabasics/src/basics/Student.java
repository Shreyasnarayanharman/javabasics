package basics;


public class Student {

	String name;
	int age;   //4 bytes -- int
	boolean isMale;  //1byte
	String address;
	static String COLLEGE_NAME = "IIT";   //static variable
	//-------------------------------
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
	void askQuestion() {
		System.out.println("asking java questions");
	}
	//--------------------------
	void writeExam() {}
	//--------------------------

	static int calculateAverage(int[] marks) {
		int average = 0;
		for(int i=0; i< marks.length;i++) {
			average = average + marks[i];
		}
		return average/marks.length;
	}
}