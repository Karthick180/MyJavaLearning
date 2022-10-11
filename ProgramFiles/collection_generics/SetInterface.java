package collection_generics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();
		/*
		 * set support only unique values, you cannot add duplicate element it doesn't
		 * follow a sequence
		 */
		values.add(5);
		values.add(6);
		values.add(9);
		values.add(5);

		for (int i : values) {
			System.out.println(i);
		}

		Set<Integer> val = new TreeSet<>(); // data in a ascending order
		val.add(50);
		val.add(64);
		val.add(19);
		val.add(37);

		for (int i : val) {
			System.out.println(i);
		}

	}

}
