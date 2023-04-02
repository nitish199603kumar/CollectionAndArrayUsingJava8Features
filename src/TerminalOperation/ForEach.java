package TerminalOperation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForEach {

	public static void main(String[] args) {
		  List<String> stringList = new ArrayList<>();

	        stringList.add("one");
	        stringList.add("two");
	        stringList.add("three");
	        stringList.add("one");
	        
	        Set<String> set=new HashSet<>();
	        ArrayList<String> al=new ArrayList<>();
	        stringList.stream().forEach(value ->{
	        	
	        	set.add(value);
	        	al.add(value);
	        	System.out.println("Value : " +value );
	        });
	        
	    	System.out.println("SET : " +set );
	    	System.out.println("ArrayList : " +al );
	}

}
