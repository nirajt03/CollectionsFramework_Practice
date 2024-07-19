package collections.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import collections.hashmap.Student;

public class ArrayListUserDefinedExample {

public static void main(String[] args) {
		
		// create hashmap
	
	
	   List<Employee> employees = new ArrayList<>();
	   employees.add(new Employee("Niraj", "Tiwari", 20, "Id:001"));
	   employees.add(new Employee("Saurav", "Tiwari", 30, "Id:002"));
	   employees.add(new Employee("Dinesh", "Tiwari", 40, "Id:003"));
	   employees.add(new Employee("Ajay", "Tiwari", 50, "Id:004"));
		

	    System.out.println(employees.toString());
		
	}
}
