package oops.encapsulation;
// encapsulation -> binding data with methods

class Student {
	private int rollno;
	private String name;

	// Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("name changed");
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("rollno changed");
	}

	public int getRollno() {
		System.out.println("user accessing the value");
		return rollno;
	}
}

public class Encapsulation {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.setName("Devil");
		System.out.println(s1.getName());

		s1.setRollno(1);

		System.out.println(s1.getRollno());
		
	}

}
