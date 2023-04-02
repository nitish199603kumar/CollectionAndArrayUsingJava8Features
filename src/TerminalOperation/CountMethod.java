package TerminalOperation;

import java.util.ArrayList;
import java.util.List;

public class CountMethod {

	public static void main(String[] args) {
		 List<String> stringList = new ArrayList<String>();

	        stringList.add("one");
	        stringList.add("two");
	        stringList.add("three");
	        stringList.add("four");
	        stringList.add("five");
	        
	        long count = stringList.stream().map(value->
	        		value.toUpperCase()).count();
	        
System.out.println("Count :" +count);
	}

}
