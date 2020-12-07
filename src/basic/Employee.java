package basic;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Employee {
	
	Scanner sc = new Scanner(System.in);
	
	public int EmpId;
	public String EmpFirstName;
	public String EmpLastName;
	public String EmpDesignation;
	public int EmpManagerId;
	public int Emp_DepId;
	public int Emp_ContactNumber;
	public String Emp_Address;
	public LocalDate Emp_DOH;
	public Date Emp_DOB;
    public double Emp_HourlyRate;
    public double Emp_bonus;
    public double Emp_tax;
    public double Emp_WorkingHours;
    public double Emp_Salary;
    	
    public Employee() {}
    
    public Employee( int Id, String FirstName, String LastName, String Designation, int ManagerId, int DepId, int ContactNumber, String Address,
    					LocalDate DOH, Date DOB, double HourlyRate, double bonus, double tax, double WorkingHours,double sal)
    {
    	EmpId = Id;
    	EmpFirstName= FirstName;
    	EmpLastName = LastName;
    	EmpDesignation = Designation;
    	EmpManagerId = ManagerId;
    	Emp_DepId = DepId;
    	Emp_ContactNumber = ContactNumber;
    	Emp_Address = Address;
    	Emp_DOH = DOH;
    	Emp_DOB = DOB;
    	Emp_HourlyRate = HourlyRate;
    	Emp_bonus = bonus;
    	Emp_tax = tax;
    	Emp_WorkingHours = WorkingHours;
    	Emp_Salary=sal;
    }
    
    public void setEmployeeId(int Id) {
    	 EmpId=Id;
    }
    public void setEmployeeFirstName(String firstname) {
    	EmpFirstName=firstname;
    }
    public void setEmployeeLastName(String lastname) {
    	EmpLastName= lastname;
    }
    
    public void setEmployeeDesignation(String Designation) {
    	EmpDesignation=Designation;
    }
    public void setEmployeeEmpManagerId(int ManagerId) {
    	EmpManagerId=ManagerId;
    }
    public void setEmployeeDepartmentId(int DepId) {
    	Emp_DepId=DepId;
    }
    public void setEmployeeContactNumber(int contactnumber) {
      Emp_ContactNumber= contactnumber;
    }
    public void setEmployeeAddress(String address) {
    	Emp_Address=address;
    }
    public void setEmployeeDateOfHire(LocalDate doh) {
    	Emp_DOH = doh;
    }
    public void setEmployeeDateOfBirth(Date dob) {
    	Emp_DOB=dob;
    }
    public void setEmployeeHourRate(double rate) {
    	Emp_HourlyRate=rate;
    }
    public void setEmployeeBonus(double bonus) {
    	Emp_bonus =bonus;
    }
    public void setEmployeeTaxRate(double tax) {
    	Emp_tax =tax;
    }    
    public void setEmployeeWorkingHours(double hours) {
    	Emp_WorkingHours =hours;
    }
    public void setEmployeeSalary(double sal) {
    	Emp_Salary=sal;
    }
	public int getEmployeeId(){
		return EmpId;
	}
	public String getEmployeeFirstName() {
   		return EmpFirstName;
	}
	public String getEmployeeLastName() {	
		return EmpLastName ;
	} 
	public String getEmployeeDesignation() {
		return EmpDesignation;
	}
	public int getEmployeeEmpManagerId() {
		return EmpManagerId;
	}
	public int getEmployeeDepartmentId() {
	   return Emp_DepId;
	}
	public int  getEmployeeContactNumber() {
	   return Emp_ContactNumber ;
	}
	public String getEmployeeAddress() {
		return Emp_Address;
	}
	public LocalDate getEmployeeDateOfHire() {
		return Emp_DOH  ;
	}
	public Date getEmployeeDateOfBirth() {
		return Emp_DOB;
	}
	public double getEmployeeHourRate() {
		return Emp_HourlyRate;
	}
	public double getEmployeeBonus() {
		return Emp_bonus ;
	}
	public double getEmployeeTaxRate() {
		return Emp_tax ;
    }    
    public double getEmployeeWorkingHours() {
    	return Emp_WorkingHours ;
    }
    public double getEmployeeSalary() {
    	return Emp_Salary;
    }
    public String displayName() {
    	String name = EmpFirstName+EmpLastName;
    	return name;
    }
	public double calculateSalary() {
		Emp_Salary = ((Emp_HourlyRate*Emp_WorkingHours)+Emp_bonus*(Emp_tax/100));
		return Emp_Salary;	   
	}
	public Period calculateExperience() {
		Period diff = Period.between(Emp_DOH, LocalDate.now());
		return diff;
	}
	public void AddEmployee() {
		System.out.println("Please enter employee Id");
		setEmployeeId(sc.nextInt());
		System.out.println("Please enter employee first name");	
		setEmployeeFirstName(sc.nextLine());
		System.out.println("Please enter employee last name");
		setEmployeeLastName(sc.nextLine());
		System.out.println("Please enter employee designation");
		setEmployeeDesignation(sc.nextLine());  
		System.out.println("Please enter employee manager Id");
		setEmployeeEmpManagerId(sc.nextInt());
		System.out.println("Please enter employee department Id");
		setEmployeeDepartmentId(sc.nextInt());
		System.out.println("Please enter employee address");
		setEmployeeAddress(sc.nextLine());
		System.out.println("Please enter employee contact number");
		setEmployeeContactNumber(sc.nextInt()); 
		System.out.println("Please enter employee year of join");
		int y = sc.nextInt();
		System.out.println("Please enter employee month of join");
		int m = sc.nextInt();  // 1-12 for January-December.
		System.out.println("Please enter employee day of join");
		int d = sc.nextInt();
		setEmployeeDateOfHire(LocalDate.of( y , m , d )); 
		System.out.println("Please enter employee hourly rate");
		setEmployeeHourRate(sc.nextDouble());
		System.out.println("Please enter employee bonus");
		setEmployeeBonus(sc.nextDouble());
		System.out.println("Please enter employee tax");
		setEmployeeTaxRate(sc.nextDouble());
		System.out.println("Please enter employee working hours");
		setEmployeeWorkingHours(sc.nextDouble());
	}
	public void DisplayEmployeeDetails() {
		System.out.println("Employee "+ displayName()+" With id "+ EmpId + " working as a  "+EmpDesignation);
		System.out.println("Is working under "+EmpManagerId+" in "+Emp_DepId+" department");
		System.out.println("Employee can be contacted on "+Emp_ContactNumber+" and on "+Emp_Address);
		System.out.println("Employee got "+ getEmployeeDateOfHire()+"  years of experience");
		System.out.println("Employee got "+ calculateSalary()+" per month");			
	} 	
}
