package oops.innerclass;

/*
 * Inner class
 *  member class -> without static keyword
 *  static class
 *  anonymous class
 */

class Outer {
	int a; // member variable

	public void show() { // member method

	}

	static class Inner { // member class
		// file name--> Outer$Inner.class
		public void display() {
			System.out.println("in display");
		}

	}
}

public class InnerClass {
	// we can create variables, methods, class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer obj = new Outer();
		obj.show();

		// way of creating inner class obj
		//Outer.Inner obj1 = obj.new Inner();
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();

	}

}
