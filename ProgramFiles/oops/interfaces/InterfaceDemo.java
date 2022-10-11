package oops.interfaces;

interface  Showing{
	 void show();
}

class Pen implements Showing{
	public void show() {
		System.out.println("i am pen");
	}
}

class Pencil implements Showing{
	public void show() {
		System.out.println("i am pencil");
	}
}

class Pouch {
	public void doSomething(Showing p) {
		p.show();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Pouch pp = new Pouch();
		
		Showing  p = new Pen();
		
		Showing pc = new Pencil();
		
		pp.doSomething(p);

	}

}
