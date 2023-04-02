package IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Peeek {

	public static void main(String[] args) {
		
		 List<String> lines = Arrays.asList("one", "two", "three","four");
		 
		 List<String> collect = lines.stream().filter(e->e.length()>4)
				 
				 .collect(Collectors.toList());
		 
		 System.out.println(collect);

	}

}
