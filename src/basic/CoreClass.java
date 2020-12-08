package basic;

public class CoreClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter organization details");
		Organization Org = new Organization();
		Org.getOrganisationDetails();
		Employee emp = new Employee();
		
		System.out.println("Please enter department details");
		Department Depts[] = new Department[5];
		for(int i=1;i<=5;i++)
		{
			Depts[i] = new Department();
			Org.addDepartment(Depts[i]);
			Org.getAllDepartmentDetailses(Depts[i]);		
		}
		System.out.println("Please enter employee details");
		emp.AddEmployee();
		emp.DisplayEmployeeDetails();
		
		System.out.println("Please enter student details");
		Student stud = new Student();
		
		stud.addStudentDetails();
		stud.displayStudentDetails();
		
		System.out.println("Please enter shop details");
		Shop sh= new Shop();
		sh.addShopDetails();
		sh.displayShopDetails();
		
		System.out.println("Please enter  area of geometric shapes ");
		Area square= new Area();
		square.calculateArea(3.5);
		square.displayArea();
		
		Area rectangle = new Area();
		rectangle.calculateArea(5, 3);
		rectangle.displayArea();
		
		Area triangle= new Area();
		triangle.calculateArea(2.5, 4, true);
		triangle.displayArea();
		
	}

}
