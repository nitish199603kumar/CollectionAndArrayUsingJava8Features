package TerminalOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Max {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");
        
        
        Optional<String> max2 = stringList.stream().max((val1,val2)->{
        	
        	int max = val1.compareTo(val2);
        	return max;
        });
        

        System.out.println("Max : " +max2.get());
	}
	
	

}
