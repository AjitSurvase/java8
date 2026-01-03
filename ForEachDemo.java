package Stream_program;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	
	public static void main(String[] args) {
		
		
		
		List<Integer>nums=Arrays.asList(1,2,3,4);
		
		nums.stream()
		.forEach(n->System.out.print(n));
		
		
}
}