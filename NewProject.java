package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class NewProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<>();
		a.add(44);
		a.add(99);
		a.add(200);
		a.add(50);
		a.add(75);

		OptionalInt result = a.stream().filter(i -> i < 100).mapToInt(Integer::intValue).max();

		// System.out.println(result);

		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());

		System.out.println(square);

		List<Employees> empList = new ArrayList<>();

		empList.add(new Employees("abc", 18, 10000));
		empList.add(new Employees("def", 20, 12000));
		empList.add(new Employees("ghi", 22, 14000));
		empList.add(new Employees("jkl", 26, 17000));
		empList.add(new Employees("mno", 27, 19000));

		List<Double> increasedSal = empList.stream().filter(i -> i.getAge() > 25).map(i -> i.getSalary() * 1.10)
				.collect(Collectors.toList());

		System.out.println(increasedSal);

	}

}
