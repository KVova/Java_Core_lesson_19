package volodymyr;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Application {

	public static void main(String[] args) throws Exception {
		
		File file = new File("Task19-01.txt");
		Employee emp = new Employee("Vitalii", 3, 350.05);
		//System.out.println(emp);
		Methods.serialize(file, (Serializable) emp);
		System.out.println(Methods.deserealize(file));
		
		System.out.println();
		Collection<Employee> employeeCollection = new ArrayList<>();
		employeeCollection.add(emp);
		employeeCollection.add(new Employee("Natali", 5, 380.00));
		employeeCollection.add(new Employee("Vicror", 3, 410.00));
		employeeCollection.add(new Employee("Olia", 1, 500.00));
		employeeCollection.add(new Employee("Vika", 2, 4800.00));
		
		System.out.println("Serialization " + employeeCollection);
		
		File file2 = new File("CollectionSerialization.txt");
		Methods.serialize(file2, (Serializable)employeeCollection);
		System.out.println("Deserialization " + Methods.deserealize(file2));
	}
	
}
