package IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
		 List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
		 
		 List<Integer> map = listOfStrings.stream()
		 .map(data->Integer.valueOf(data)).collect(Collectors.toList());
		 
		 System.out.println("Map : "+map);
	}

}
