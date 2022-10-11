package oops.interfaces;


@FunctionalInterface
interface I{
	void show();
	}

public class Lambda {

	public static void main(String[] args) {
		
		I obj =()-> System.out.println("I am good"); // only works with functional interface
		obj.show();

	}

}
