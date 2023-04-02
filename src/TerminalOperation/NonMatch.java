package TerminalOperation;

import java.util.ArrayList;
import java.util.List;

public class NonMatch {

	public static void main(String[] args) {

		List<String> stringList = new ArrayList<String>();

        stringList.add("john");
        stringList.add("tom");
        
        boolean noneMatch = stringList.stream().noneMatch((value)->{
        	return "nitish".equals(value);
        });
		
        System.out.println("NoneMatch : "+noneMatch);
	}

}
