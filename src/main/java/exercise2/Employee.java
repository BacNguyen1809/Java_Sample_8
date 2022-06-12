/*
	* @author bacng
	* @ Date Jun 11, 2022
*/
package exercise2;

public class Employee {
	private String name;
	private String lastName;
	private double salary = 0.0;
	public Employee() {
		super();
	}
	public Employee(String name, String lastName, double salary) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String display() {
		return "Employee [name=" + name + ", lastName=" + lastName + ", salary=" + salary + "]";
	}
	
	

}
