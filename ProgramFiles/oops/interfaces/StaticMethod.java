package oops.interfaces;

@FunctionalInterface
interface Dem{
	int num = 7;// this is a constant.
	void abc();
	static void show() {
		System.out.println("Hello");
	};
	
	default void c() {
		System.out.println("in C");
	}
	
}

class Already implements Dem{
	public void abc() {
		System.out.println("in abc");
	}
	
	@Override
	public void c() {
		System.out.println("Inside a car");
	}
	
	
}

public class StaticMethod {

	public static void main(String[] args) {
		Dem.show();
		Already obj = new Already();
		
		obj.c();
	}

}
