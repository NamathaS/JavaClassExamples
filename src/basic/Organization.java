package basic;
import java.util.Scanner;


public class Organization {

	Scanner sc = new Scanner(System.in);
	
	private int Org_Id;
	private String Org_Name;
	private String Org_Description;
	private String Org_Location;
	private String Org_Address;
	private String Org_Owner;
	private int Org_Employee_Count;
	private double Org_Gross_Profit;
	private double Org_Net_Profit;
	private double Org_turnover;
	private double Org_Cost_Products;
	private double Org_Expense;
	private Department Department = new Department();
	
		
	public Organization() {}
	public Organization(int Id, String Name, String Description, String Location, String Address, String Owner,int Employee_Count, double Gross_Profit, double Net_Profit,double turnover, double Cost_Products,double expense, Department Department) {
	  this.Org_Id=Id;
	  this.Org_Name=Name;
	  this.Org_Description=Description;
	  this.Org_Location= Location;
	  this.Org_Address=Address;
	  this.Org_Owner=Owner;
	  this.Org_Employee_Count= Employee_Count;
	  this.Org_Net_Profit=Net_Profit;
	  this.Org_Gross_Profit=Gross_Profit;
	  this.Org_turnover=turnover;
	  this.Org_Cost_Products=Cost_Products;
	  this.Org_Expense=expense; 
	  this.Department = Department;
	}
	
	public void setOrganisationName(String name) {
		Org_Name=name;
	}
	public void setOrganisationDescription(String description) {
		Org_Description=description;
	}
	public void setOrganisationLocation(String location) {
		Org_Location=location;
	}
	public void setOrganisationAddress(String address) {
		Org_Address=address;
	}
	public void setOrganisationOwner(String owner) {
		Org_Owner=owner;
	}
	
	public int getOrganisationId() {
		return Org_Id;
	}
	public String getOrganisationName() {
		return Org_Name;
	}
	public String getOrganisationDescription() {
		return Org_Description;
	}
	public String getOrganisationLocation() {
		return Org_Location;
	}
	public String getOrganisationOwner() {
		return Org_Owner;
	}
	public String getOrganisationAddress() {
		return Org_Address;
	}
	public int getOrganisationEmployeeCount() {
		return Org_Employee_Count;
	}
	public double getOrganisationGrossProfit() {
		return calculateOrganisationGrossProfit();
	}
	public double getOrganisationNetProfit() {
		return calculateOrganisationOrgNetProfit();
	}
	public double getOrganisationCostProducts() {
		return Org_Cost_Products;
	}	
	public double getOrganisationTurnOver() {
		return Org_turnover;
	}	
	public double getOrganisationExpense() {
		return Org_Expense;
	}
	
	public double calculateOrganisationGrossProfit() {
		Org_Gross_Profit = Org_turnover - Org_Cost_Products;
		return Org_Gross_Profit;
	}
	public double calculateOrganisationOrgNetProfit() {
		Org_Net_Profit = Org_Gross_Profit - Org_Expense;
		return Org_Net_Profit;
	}
	
	public void addDepartment(Department Dep ) {
		System.out.println("Please enter department"+Dep.toString()+" details");
		System.out.println("Id");
		Dep.deptId = sc.nextInt();
		System.out.println("Name");
		Dep.deptName=sc.next();
		System.out.println("Description");
		Dep.deptDescription = sc.next();
		System.out.println(" Manager Id");
		Dep.deptManagerId=sc.nextInt();
		System.out.println("Manager name");
		Dep.deptManager=sc.next();
		
	}
	public void getAllDepartmentDetailses(Department Dep) {
		System.out.println("Department Id " +Dep.deptId);
		System.out.println("Department Name " +Dep.deptName);
		System.out.println("Department Description" +Dep.deptDescription);
		System.out.println("Manager is "+ Dep.deptManager+" with Id "+ Dep.deptManagerId);
		System.out.println();
	}
	public void getOrganisationDetails() {
		System.out.println("Please enter organisation details");
		System.out.println(" Organisation Id");
		Org_Id = sc.nextInt();
		System.out.println(" Organisation name");		  
		Org_Name = sc.next();
		System.out.println(" Description");
		Org_Description=sc.next();
		System.out.println(" Location");
		Org_Location =sc.next();
		System.out.println(" Address");
		Org_Address=sc.next();
		System.out.println(" Owner");
		Org_Owner = sc.nextLine();
		System.out.println(" Turn over");
		Org_turnover =sc.nextDouble();
		System.out.println(" Cost of Products");
		Org_Cost_Products=sc.nextDouble();
		System.out.println(" Expense");
		Org_Expense =sc.nextDouble();
	}
}
