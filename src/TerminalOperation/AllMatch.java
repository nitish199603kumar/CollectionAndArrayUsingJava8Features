package TerminalOperation;

import java.util.ArrayList;
import java.util.List;

public class AllMatch {

	public static void main(String[] args) {
		
		 List<String> stringList = new ArrayList<String>();

	        stringList.add("Java Guides");
	        stringList.add("Python Guides");
	        stringList.add("C Guides");
	        
	        

	        boolean allMatch = stringList.stream().allMatch((value)->{
	        	if(value.contains("Guides"))
	        	{
	        		return true;
	        	}else{
	        		return false;
	        	}
	        	
	       // 	return value.contains("guides");
	        });
	        
	        System.out.println(allMatch);
	}

}
