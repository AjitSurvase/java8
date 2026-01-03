package Stream_program;

import java.util.Arrays;
import java.util.List;

public class PeekDemo {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3);
		
		 nums.stream()
         .peek(n -> System.out.println("Before map: " + n))
         .map(n -> n * 2)
         .peek(n -> System.out.println("After map: " + n))
         .forEach(System.out::println);
		
		
	}

}
