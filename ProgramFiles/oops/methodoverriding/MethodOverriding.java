package oops.methodoverriding;

// method overriding
class A {

	public void show() {
		System.out.println("In A");
	}
}

class B extends A {

	@Override // used to avoid compile time error
	public void show() {

		super.show();
		System.out.println("In B");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		B obj = new B();
		obj.show();
	}

}
