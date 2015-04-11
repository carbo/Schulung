package UebCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeUsage {
	
	public static void main(String[] args) {
		Employee employee1 = new Employee(3000, "Müller", "Peter");
		Employee employee2 = new Employee(5000, "Schulz", "Rolf");
		Employee employee3 = new Employee(2000, "Ahrens", "Dieter");
		Employee employee4 = new Employee(6000, "Schmidt", "Franz");
		
		List employees = new ArrayList();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		
		Collections.sort(employees, new GehaltsComparator());
		
		for(int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i));
			
		}
		System.out.println("------------------------------------");
		
		Collections.sort(employees, new NameComparator());
		
		for(int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i));
			
		}
		
	}

}
