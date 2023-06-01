package non_static;

public class Employee {

	int empId =12;
	String empName = "Arpit";
	String empEmail ="Arpit@gmail.com";
	
	public void empDetail() {
		System.out.println("===========Details of employee==========");
		System.out.println("Eating, Working, Sleeping, ");
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println("ID of Emp :-"+employee.empId);
		System.out.println("Name of emp :-"+employee.empName);
		System.out.println("Email of emp :-"+employee.empEmail);
		employee.empDetail();
	}
}
