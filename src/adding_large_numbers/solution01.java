package adding_large_numbers;

import java.util.ArrayList;
import java.util.List;

public class solution01 {
	
	public static long bigSum(List<Long> arr) {
		long value = 0;
		
		for(int i = 0; i<arr.size(); i++) {
			value += arr.get(i);
		}
		
		return value;
	}

	public static void main(String[] args) {

		ArrayList<Long> myArray = new ArrayList<>();
		myArray.add((long) 10000004);
		myArray.add((long) 10000005);
		myArray.add((long) 10000006);
		myArray.add((long) 10000008);
		
		
		System.out.println(bigSum(myArray));
	}

}
