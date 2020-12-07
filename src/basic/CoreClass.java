package basic;

public class CoreClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Organization Org = new Organization();
		Employee emp = new Employee();
		
		Department SalesDept = new Department();
		SalesDept.deptId=101;
		SalesDept.deptName="Sales";
		SalesDept.deptDescription="Department of Sales";
		SalesDept.deptManagerId=110;
		SalesDept.deptManager="Mark Owen";
		Org.addDepartment(SalesDept);
		
		SalesDept.getAllDepartmentDetails();
		
		Department HrDept = new Department();
		HrDept.deptId=201;
		HrDept.deptName="HR";
		HrDept.deptDescription="Department of Human Resource";
		HrDept.deptManagerId=210;
		HrDept.deptManager="George Smith";
		Org.addDepartment(HrDept);
		
		HrDept.getAllDepartmentDetails();
		emp.AddEmployee();
		emp.DisplayEmployeeDetails();
		
		
	}

}
