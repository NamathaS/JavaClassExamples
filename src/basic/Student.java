package basic;

import java.util.Scanner;


public class Student {
	Scanner sc = new Scanner(System.in);
	
	public int StudentId;
	public String FirstName;
	public String LastName;
	public int Age;
	public String Address;
	public int ContactDetails;
	public int Standard;
	public String MainStream;
	public double TotalMarks;
	public double Percentage;
	public char Grade;
	
	public Student() {}
	
	public Student(int Id, String firstname,String lastname,int age,String address,int contact,
					int stnd,String mainstream,double totalmarks,double percentage) {
		StudentId= Id;
		FirstName = firstname;
		LastName = lastname;
		Age = age;
		Address= address;
		ContactDetails=contact;
		Standard =stnd;
		MainStream=mainstream;
		TotalMarks=totalmarks;
		Percentage=percentage;
	}
	
	//setters
	
	public void setStudentID(int Id) {
		StudentId= Id;
	}
	public void setFirstName(String firstname) {
		FirstName = firstname;
	}
	public void setLastName(String lastname) {
		LastName = lastname;
	}
	public void setAge(int age) {
		Age = age;
	}
	public void setAddress(String address) {
		Address= address;
	}
	public void setContactDetails(int contact) {
		ContactDetails=contact;
	}
	public void setStandard(int stand) {
		Standard =stand;
	}
	public void setMainStream(String mainstream) {
		MainStream=mainstream;
	}
	public void setGrade(char grade) {
		Grade=grade;
	}

	//getters
	
	public int getStudentID() {
		return StudentId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public int getAge(int age) {
		return Age;
	}
	public String getAddress() {
		return Address;
	}
	public int getContactDetails() {
		return ContactDetails;
	}
	public int getStandard() {
		return Standard;
	}
	public String getMainStream() {
		return MainStream;
	}
	public double getTotalMarks() {
		return TotalMarks;
	}
	public double getPercentage() {
		return Percentage;
	}
	public char getGrade() {
		return Grade;
	}
	
	//methods
	
	public void addStudentDetails() {
		
		System.out.println("ID : ");
		StudentId= sc.nextInt();
		
		System.out.println("First Name : ");	
		FirstName = sc.next();
		
		System.out.println("Last Name : ");
		LastName = sc.next();
		
		System.out.println("Age : ");
		Age = sc.nextInt();
		
		System.out.println("Address: ");
		Address= sc.next();
		
		System.out.println("Contact Number : ");
		ContactDetails=sc.nextInt();
		
		System.out.println("Standard : ");
		Standard =sc.nextInt();
		
		System.out.println("Main Stream: ");
		MainStream=sc.next();
		
		calculateTotalMarkAndPercentage();
		
	}
	
	public void calculateTotalMarkAndPercentage() {
		double totalmarks= 0 ;
		int sub,i,fullmark;
		
		System.out.println("Please enter number of subjects");
		sub = sc.nextInt();
		
		System.out.println("Please enter marks for : ");
		for(i=1;i<=sub;i++)
		{
			System.out.println("Subject "+i+ " : ");
			totalmarks+=sc.nextDouble();
		}
		TotalMarks= totalmarks;
		fullmark = sub*100;
		
		Percentage = (totalmarks/fullmark)*100;	
		
		Grade = calculateGrade(Percentage);
	}
	
	public void displayStudentDetails() {
		System.out.println("");
		System.out.println("");
		
		System.out.println("ID : "+StudentId);
		System.out.println("Full Name : "+ displayName());		
		System.out.println("Age : "+Age);
		System.out.println("Address: "+Address);
		System.out.println("Contact Number : "+ContactDetails);	
		System.out.println("Standard : "+Standard);
		System.out.println("Main Stream: "+MainStream);
		System.out.println("TotalMarks: "+TotalMarks);
		System.out.println("Percentage: "+Percentage);
		System.out.println("Grade: "+Grade);
		
	}
	
	public String displayName() {
		return this.FirstName+"  "+this.LastName;
	}
	
	public char calculateGrade(double per) {
		char grade;
		
		if(per>=90)
			grade='A';
		else if(per>=80 && per<90)
			grade='B';
		else if(per>=70 && per<80)
			grade='C';
		else if(per>=60 && per<70)
			grade='D';
		else
			grade='F';
		return grade;
	}

}