package collection_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>{
	int rollno, marks;
	String name;
	public Stud(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTo(Stud s) {
		return marks>s.marks?1:-1; // sort by marks
		
	}
	
}

public class ComparableInterface {

	
	public static void main(String[] args) {
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(1,"Raj",99));
		studs.add(new Stud(2,"Ram",80));
		studs.add(new Stud(3,"Ravi",60));
		
		Collections.sort(studs,(i,j)->i.name.length()>j.name.length()?1:-1); // sort by name
		
		for (Stud s: studs) {
			System.out.println(s);
		}

	}

}
