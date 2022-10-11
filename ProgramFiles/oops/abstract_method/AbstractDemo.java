package oops.abstract_method;

abstract class Human {
	public abstract void eat();

	public void walk() {
		System.out.println("Ready to walk");
	}
}

class Man extends Human { // concrete class

	public void eat() {

		System.out.println("Eating");
	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		Human obj = new Man();
		
		obj.eat();
		obj.walk();
	}

}
