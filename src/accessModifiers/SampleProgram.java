package accessModifiers;

public class SampleProgram {

	private int StudentId=8;
	int value = 10;
	public int samplevalue = 34;
	protected int proValue = 45;
	
	/*
	 * public static void main(String args[]) {
	 * 
	 * SampleProgram obj = new SampleProgram(); obj.displayStudentId();
	 * System.out.println("value  :"+ obj.value);
	 * System.out.println("Pro_vale  :"+obj.proValue);
	 * 
	 * }
	 */
	public void displayStudentId() {
		System.out.println("Student Id is : "+StudentId);
	}
}
