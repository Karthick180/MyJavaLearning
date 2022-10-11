package oops.wrapperclass_autoboxing;

public class WrapperClass {

	public static void main(String[] args) {
		int i = 5; // primitive data type
		
		Integer ii = new Integer(i); // wrapper class // Called boxing or wrapping
		int j = ii.intValue(); // unboxing , unwrapping
		
		Integer value = i; // auto boxing
		
		int k = value; // auto unboxing
		
		
		String str = "1801";
		
		int n = Integer.parseInt(str); // used to takeout the int value in a string
		
		System.out.println(n);
		
	}

}
