package IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("Java","C","Python");
		
		List<String> collect = asList.stream().filter(line-> !"c".equalsIgnoreCase(line))
		.collect(Collectors.toList());

		String string = collect.get(0);
		
		System.out.println(collect.get(1));
		
		collect.forEach(data->{
			System.out.println("Data : "+data);
		});
	}

}
