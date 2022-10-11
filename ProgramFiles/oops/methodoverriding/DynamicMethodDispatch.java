package oops.methodoverriding;

class C {

	public void show() {
		System.out.println("In C");
	}
}

class D extends C {

	public void show() {

		System.out.println("In D");
	}

}

class E extends C {
	public void show() {
		System.out.println("In E");
	}
}

public class DynamicMethodDispatch {
	
	// Compile time and Runtime polymorphism

	public static void main(String[] args) {

		C obj = new D(); // Runtime polymorphism
		obj.show();
		
		obj = new E();
		obj.show(); //DynamicMethodDispatch

	}

}
