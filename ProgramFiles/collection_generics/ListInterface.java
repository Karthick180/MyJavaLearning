package collection_generics;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		List values = new ArrayList();
		
		values.add(9); // Integer v = new Integer(4);
		values.add(4);
		values.add(7);
		values.add(2,3);
		
		for (int i=0;i<values.size();i++) {
			System.out.println(values.get(i));
		}
		
		for (Object o:values) {
			System.out.println(o);
		}

	}

}
