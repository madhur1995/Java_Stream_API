package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class studentProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = new ArrayList<>();

		list.add(new Student("Aman", 67, 80, 60));
		list.add(new Student("Yogi", 56, 69, 65));
		list.add(new Student("KP", 64, 80, 70));

		list.stream().forEach(i -> System.out.println(
				i.getStudentName() + "   Total Marks   " + Integer.valueOf(i.getM1() + i.getM2() + i.getM3())));

		list.stream().sorted((i1, i2) -> (int) (i1.getM1() - i2.getM1())).forEach(i -> System.out.println(i));

		Optional<Student> emp = list.stream().min(Comparator.comparing(Student::getM1));
		System.out.println(emp);

	}

}
