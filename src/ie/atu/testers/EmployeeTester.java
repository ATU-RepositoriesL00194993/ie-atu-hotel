package ie.atu.testers;

import ie.atu.hotel.*;
import java.util.ArrayList;

public class EmployeeTester {
	public static void main(String args[]) {
		ArrayList<Employee> empls = new ArrayList<Employee>();
		
		empls.add(new Employee(new Name("Ms", "Faye", "McGuire"),
				"087 1234567",
				new Date(7,  12, 2000),
				new Date(12, 10, 2012),
				24000.00
			));
		
		empls.add(new Employee(
				new Name("Mr", "Ben", "Carson"),
				"086 1234567",
				new Date(20, 10, 1980),
				new Date(10, 10, 2012),
				42000.00
			));
		
		empls.add(new Employee(
				new Name("Mr", "Mark", "Logan"),
				"087 9876543",
				new Date(1, 1 , 1994),
				new Date(2, 8, 2018),
				28000
			));
		
		for (Employee e : empls) {
			System.out.println(e);
		}
		
		System.out.println("\nIncrementing salaries...");
		for (Employee e : empls) {
			if (e.getSalary() < 30000) {
				e.incrementSalary(1000);
			}
			System.out.println(e);
		}
		
		System.out.println("\nDisplaying homepay...");
		for (Employee e : empls) {
			double taxPercentage;
			if (e.getSalary() <= 35000) {
				taxPercentage = 20;
			} else {
				taxPercentage = 40;
			}
			System.out.printf("%.2f\n", e.calculatePay(taxPercentage));
		}
	}
}
