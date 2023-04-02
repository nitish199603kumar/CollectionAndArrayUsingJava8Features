package TerminalOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<String>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five");

        List<String> collect = stringList.stream().map(value->
        
        value.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
	}

}
