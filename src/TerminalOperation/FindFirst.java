package TerminalOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirst {

	public static void main(String[] args) {
//		The Java Stream findFirst() method finds the first element in the Stream if any elements are present in the Stream. 
//		The findFirst() method returns an Optional from which you can obtain the element if present. 

		 List<String> stringList = new ArrayList<>();

	        stringList.add("one");
	        stringList.add("two");
	        stringList.add("three");
	        stringList.add("one");
	        stringList.add("two");
	        
	        Optional<String> findFirst = stringList.stream().findFirst();
	        System.out.println("FindFirst : " +findFirst.get());

	}

}
