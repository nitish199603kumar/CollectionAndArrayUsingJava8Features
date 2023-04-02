package IntermediateOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Distinct {

	public static void main(String[] args) {
		
		 List<String> stringList = new ArrayList<>();

	        stringList.add("one");
	        stringList.add("two");
	        stringList.add("three");
	        stringList.add("one");
	        
	        List<String> collect = stringList.stream().distinct().collect(Collectors.toList());
//	        Stream<String> distinct = stringList.stream().distinct();
	        
	        System.out.println("Distinct : "+collect);

	}

}
