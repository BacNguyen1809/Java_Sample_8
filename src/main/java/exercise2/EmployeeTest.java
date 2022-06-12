/*
	* @author bacng
	* @ Date Jun 11, 2022
*/
package exercise2;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee[]empl = new Employee[2];
		Scanner scanner = new Scanner(System.in);
		//create 2 employees
		for (int i = 0; i < empl.length; i++) {
			empl[i] = new Employee();
			System.out.println("input name employee "+ (i+1));
			empl[i].setName(scanner.nextLine());
			System.out.println("input last name employee "+ (i+1));
			empl[i].setLastName(scanner.nextLine());
			System.out.println("input salary employee "+ (i+1));
			empl[i].setSalary(Double.parseDouble(scanner.nextLine()));
		}
		//display information 2 employees
		for (int i = 0; i < empl.length; i++) {
			System.out.println(empl[i].display());
		}
		// salary rise 10% 
		for (int i = 0; i < empl.length; i++) {
			empl[i].setSalary(empl[i].getSalary()*1.1);
		}
		//display information 2 employees after rised salary
		System.out.println("-----------after rise 10%---------------");
		for (int i = 0; i < empl.length; i++) {
			System.out.println(empl[i].display());
		}
	}

}
