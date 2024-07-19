package collections.arraylist;

public class Employee {
	private String firstName;
	private String lastName;
	private int  age;
	private String empId;
	
	public Employee(String firstName, String lastName, int age, String empId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + this.firstName + ", this.lastName=" + lastName + ",age=" + this.age + ",empId=" + this.empId + "]";
	}
}
