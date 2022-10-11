package varargs;

class calc{
	public int add(int ... n) // {1,2,3,4,5} // Variable length arguments
	{
		int sum = 0;
		for (int i : n)
		{
			sum = sum +i;
		}
		return sum;
	}
}

public class Varargs {

	public static void main(String[] args) {
	calc obj = new calc();
	System.out.println(obj.add(1,2,3,4,5,6));

	}

}
