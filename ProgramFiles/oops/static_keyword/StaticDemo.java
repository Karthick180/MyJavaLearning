package oops.static_keyword;

class Emp{
	int eid;
	int salary;
	static String ceo;
	
	static {
		ceo = "Brain"; // execute only once
		System.out.println("in static");
	}
	
	public Emp() { // executes every object creation
		eid = 1;
		salary = 25000;
		System.out.println("in constructor");
	}
	
	public void show() {
		System.out.println(eid + ":"+ salary +":"+ceo);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Emp ram = new Emp();
		//ram.eid = 9;
		//ram.salary = 50000;
		//Emp.ceo = "rahul";
		
		Emp raj = new Emp();
		//raj.eid = 10;
		//raj.salary = 40000;
		//Emp.ceo = "rahul";
		
		//Emp.ceo = "Nikita";
		
		ram.show();
		raj.show();
	}

}
