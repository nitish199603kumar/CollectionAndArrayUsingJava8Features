package TerminalOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindAny {

	public static void main(String[] args) {
	//	The Java Stream findAny() method can find a single element from the Stream.
//		The element found can be from anywhere in the Stream.
//		There is no guarantee about from where in the stream the element is taken. 

		 List<String> stringList = new ArrayList<>();

            stringList.add("one");
	        stringList.add("two");
	        stringList.add("three");
	        stringList.add("one");
	        
	        Optional<String> findAny = stringList.stream().findAny();
	        System.out.println("FindAny : " +findAny.get());
	        
	}

}
