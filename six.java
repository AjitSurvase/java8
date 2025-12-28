package Stream_program;

import java.util.Arrays;
import java.util.List;

public class six {
	
	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(1, 2, 3);
		
		nums.stream()
		.filter(n->{
			System.out.println("filterning :"+n);
			
			return n>1;
		});
		
		System.out.println("***************");    
		
		
		
		nums.stream()
		.filter(n->{
			System.out.println("filterning :"+n);
			return n>1;
		})
		.forEach(System.out::println);
		
		
		
		
		
	}

}
