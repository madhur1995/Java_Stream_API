package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number = Arrays.asList(2, 3, 4, 5, 5, 5, 6);

		// demonstration of map method
		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(square);

		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

		// demonstration of filter method
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);

		List<String> show = names.stream().sorted().collect(Collectors.toList());
		System.out.println(show);

		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

		// collect method returns a set
		Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println(squareSet);

		number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

		int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

		System.out.println(even);
		System.out.println("************************************************");

		Stream<Integer> s1 = number.stream();

		Stream<Integer> filterStream = s1.filter(x -> x >= 4);
		filterStream.forEach(x -> System.out.println(x));
		System.out.println("************************************************");
		System.out.println("Normal Sorting");
		List<Integer> sorted = number.stream().sorted().collect(Collectors.toList());

		System.out.println(sorted + " ");

		System.out.println("Customised Sorting");
		List<Integer> sorted1 = number.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());

		System.out.println(sorted1 + " ");

		System.out.println("************************************************");

		System.out.println("Min Value & Max Values");

		Integer minValue = number.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Min Value :" + minValue);

		Integer maxValue = number.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Max Value :" + maxValue);

		System.out.println("************************************************");

		System.out.println("Use of of ");
		String[] name = { "abc", "ahah", "rss", "twtw" };
		Stream.of(name).filter(x -> x.startsWith("a")).forEach(i -> System.out.println(i));

		System.out.println("************************************************");

		number.stream().skip(2).forEach(i -> System.out.println(i));

		System.out.println("************************************************");

		number.stream().collect(Collectors.toSet()).forEach(i -> System.out.print(i + " "));

		System.out.println("************************************************");

		List<String> names1 = Arrays.asList("Reflection", "Collection", "Stream", "Stream");

		Set<String> op = names1.stream().filter(y -> Collections.frequency(names1, y) > 1)
				.collect(Collectors.toSet());

		System.out.println(op);

	}

}
