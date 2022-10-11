package collection_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorInterface {

	public static void main(String[] args) {
		// Collection Interface
		Collection values = new ArrayList();
		values.add(7);
		values.add(9);
		values.add(2000);
		
		Iterator it = values.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
