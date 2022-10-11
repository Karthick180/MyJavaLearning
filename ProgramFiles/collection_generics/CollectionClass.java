package collection_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClass {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>(); // List are mutable
		values.add(404);
		values.add(908);
		values.add(639);
		values.add(265);
		
		
		// comparator interface
		//Comparator<Integer>  c  = (i,  j)->i%10>j%10?1:-1;
//				if(i%10>j%10)
//					return 1;
//				else
//					return -1;
				
				
			
				
		
		
//		Collections.sort(values);
//		Collections.reverse(values);
		
		Collections.sort(values,(i,j)->i%10>j%10?1:-1);
		
		
		for(Integer o:values) {
			System.out.println(o);
		}

	}

}
