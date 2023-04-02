package TerminalOperation;

import java.util.ArrayList;
import java.util.List;

public class AnyMatch {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<String>();

        stringList.add("Java Guides");
        stringList.add("Python Guides");
        stringList.add("C Guides");
        
        stringList.stream().anyMatch((value)->{
        	System.out.println(value.startsWith("Java"));
        	return value.startsWith("Java");
        });

	}

}
