package oops.abstract_method;

class Printer{
	public void show(Number i) {
		
		System.out.println(i);
	}
}

public class AbDeepDive {

	public static void main(String[] args) {
		Printer obj = new Printer();
		
		obj.show(7.7);
		obj.show(7);

	}

}
