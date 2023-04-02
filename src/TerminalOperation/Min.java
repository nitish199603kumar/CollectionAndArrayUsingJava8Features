package TerminalOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Min {

	public static void main(String[] args) {
		 List<String> stringList = new ArrayList<>();

	        stringList.add("one");
	        stringList.add("two");
	        stringList.add("three");
	        stringList.add("one");
	        
	        Optional<String> min = stringList.stream().min((v1,v2)->{
	        	return v1.compareTo(v2);
	        });
	        
	        System.out.println("Min : " +min.get());

	}

}
