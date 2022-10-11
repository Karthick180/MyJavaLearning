package oops.method_constructor_overloading;

class Casio{
	public void add(int a, int b) {
		System.out.println(a+b);
	}

	public void add(int i, int j, int k) {
		// TODO Auto-generated method stub
		System.out.println(i+j+k);
		
	}

	public void add(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casio obj = new Casio();
		obj.add(4.5, 5.6);
		obj.add(4,3,7);
		
	}

}
