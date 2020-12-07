package basic;

public class Department {
	public int deptId;
	public String deptName;
	public String deptDescription;
	public String deptManager;
	public int deptManagerId;
	
	public Department() {}
	
	public Department( int Id,String Name, String Description, String Manager, int ManagerId) {
		this.deptId= Id;
		this.deptName= Name;
		this.deptDescription= Description;
		this.deptManager= Manager;
		this.deptManagerId= ManagerId;
	}
	
	public void setDepartmentId(int dptId) {
		deptId=dptId;
	}
	
	public void setDepartmentName(String dptName) {
		deptName=dptName;
	}
	public void setDepartmentDescription(String dptDescription) {
		deptDescription=dptDescription;
	}
	public void setDepartmentManager(String dptManager) {
		deptManager=dptManager;
	}
	public void setDepartmentManagerId(int dptManagerId) {
		deptManagerId=dptManagerId;
	}
	
	
	public int getDepartmentId() {
		return deptId;
	}
	public String getDepartmentName() {
		return deptName;
	}
	public String getDepartmentDescription() {
		return deptDescription;
	}
	public String getDepartmentManager() {
		return deptManager;
	}
	public int getDepartmentManagerId() {
		return deptManagerId;
	}
	
	public void getAllDepartmentDetails() {
		System.out.println("Department Id " +deptId);
		System.out.println("Department Name " +deptName);
		System.out.println("Department Description" +deptDescription);
		System.out.println("Manager is "+ deptManager+" with Id "+ deptManagerId);
		System.out.println();
	}
}
