package collection_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWithList {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>(); //<Integer> -> Generics
		values.add(9);
		values.add(10);
		values.add(11);
		values.add(12);
		
		for(Integer o:values) {
			System.out.println(o);
		}
		

	}

}
