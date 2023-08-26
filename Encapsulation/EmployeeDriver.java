package Encapsulation;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpId(101);
		employee.setEmpName("Arpit");
		employee.setEmpEmail("arpit@gmail.com");
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpEmail());
	}
}
