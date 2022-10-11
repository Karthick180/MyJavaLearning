package oops.interfaces;


@FunctionalInterface
interface Demo{
	void abc();
	default void show() {
		System.out.println("in demo show");
	}
}

interface MyDemo{
	default void show() {
		System.out.println("in mydemo show");
	}
}

class DemoImp implements Demo, MyDemo {
	public void abc() {
		System.out.println("in abc");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Demo.super.show();
	}
	
//	public void show() {
//		System.out.println("in demoimp show");
//	}
	
}

public class DefaultMethod {

	public static void main(String[] args) {
		
		Demo obj = new DemoImp();
		obj.abc();
		obj.show();
		
	}

}
