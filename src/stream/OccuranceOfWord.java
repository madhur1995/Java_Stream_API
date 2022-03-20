package stream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfWord {

	public static void main(String[] args) {

		String s = "My name is khan name";
		List<String> list = Arrays.asList(s.split(" "));

		//System.out.println(list);

		Map<String, Long> count = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(count);

	}

}
