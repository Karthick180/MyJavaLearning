package oops.interfaces;

class A{
	public void show() {
		System.out.println("in A show");
	}
}

public class AnonymousDemo {

	public static void main(String[] args) {
		A obj = new A() {
			public void show() {
				System.out.println("i am the best");
			}
		};
		obj.show();

	}

}
