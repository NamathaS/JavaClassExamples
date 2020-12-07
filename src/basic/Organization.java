package basic;

public class Organization {

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
		Department.deptId= Dep.deptId;
		Department.deptName=Dep.deptName;
		Department.deptDescription=Dep.deptDescription;
		Department.deptManagerId=Dep.deptManagerId;
		Department.deptManager=Dep.deptManager;
	}
	
}
