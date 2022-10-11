package oops.constructor;

class Calc{
	int num1;
	int num2;
	int result; 
	
// Defining a constructor
	public Calc() {
		this.num1 = 5;
		this.num2 = 5;
	}
	
// Overloading constructor
	public Calc(int a) {
		this.num1 = a;
		this.num2 = a;
		
	}
	
	public Calc(double a, int b) {
		this.num1 = (int) a;
		this.num2 = b;
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		Calc obj = new Calc(6.5,7); // calc() --> constructor
		
		System.out.println(obj.num1);
		
	}

}
