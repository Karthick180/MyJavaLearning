package oops.final_keyword;

 final class A{
	final int i = 0; // can not change final variable -> constant
	public A() {
//		i = 10;
	}
	
	public final void show() {
		System.out.println("Showing");
	}
}


class B extends A{
	public void show() {
		System.out.println("in B show");
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		//A obj = new A();
		//System.out.println(obj.i);
		B obj = new B();
		obj.show();
	}

}
