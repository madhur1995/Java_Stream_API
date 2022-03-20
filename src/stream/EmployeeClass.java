package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeClass {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "ddddsgysy", 101, "active", 20000));
		list.add(new Employee(2, "sggsgysy", 102, "active", 30000));
		list.add(new Employee(3, "sysyysy", 103, "inactive", 40000));
		list.add(new Employee(4, "hwhwhhw", 102, "active", 50000));
		list.add(new Employee(5, "aahahha", 103, "inactive", 60000));

		Map<Integer, List<Employee>> empListBasedOnDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.toList()));

		empListBasedOnDept.entrySet().forEach(i -> {
			System.out.println(i.getKey() + "---------" + i.getValue());

		});

		System.out.println("******************************************************");

		Map<Integer, Long> empCountDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.counting()));

		empCountDept.entrySet().forEach(i -> {
			System.out.println(i.getKey() + "---------" + i.getValue());

		});

		System.out.println("******************************************************");

		long activeEmp = list.stream().filter(i -> "active".equals(i.getEmployeeStatus())).count();
		long InactiveEmp = list.stream().filter(i -> "inactive".equals(i.getEmployeeStatus())).count();

		System.out.println("Active Employees :" + activeEmp);
		System.out.println("Inactive Employees :" + InactiveEmp);

		System.out.println("******************************************************");

		Optional<Employee> emp1 = list.stream().max(Comparator.comparing(Employee::getEmployeeSalary));
		Optional<Employee> emp2 = list.stream().min(Comparator.comparing(Employee::getEmployeeSalary));

		System.out.println(emp1);
		System.out.println(emp2);
		
		System.out.println("******************************************************");

		List<Employee> sorted = list.stream().sorted(Comparator.comparing(Employee::getEmployeeSalary))
				.collect(Collectors.toList());
		sorted.forEach(i -> System.out.println(i));
		
		
		
		
		
		

	}

}
