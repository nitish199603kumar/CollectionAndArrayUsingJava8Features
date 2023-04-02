package IntermediateOperation;

import java.util.ArrayList;
import java.util.List;

public class Limit {

	public static void main(String[] args) {
		 List<String> stringList = new ArrayList<>();

	        stringList.add("one");
	        stringList.add("two");
	        stringList.add("three");
	        stringList.add("one");
	        
	        stringList.stream().limit(3).forEach(data->{
	        
	        System.out.println("Data : " +data);
	        
	        });

	}

}
