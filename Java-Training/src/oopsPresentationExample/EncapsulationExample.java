package oopsPresentationExample;

public class EncapsulationExample {

	public static void main(String args[]) {
		Employee obj = new Employee();
		//field is not visible in this class.
		/*
		 * System.out.println(obj.numOfEmployees);
		 */
		
		//Set value for that field to use it here
		obj.setEmpName("Dhvani");
        obj.setEmpAge(28);
        obj.setEmpSSN(112233);
        obj.setNoOfEmployees(5613);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
        System.out.println("Employee Age: " + obj.getEmpAge());
		System.out.println("No Of Employees: " + (int) obj.getNoOfEmployees());
		
	}

}
