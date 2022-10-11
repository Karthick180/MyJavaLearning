package exception_handling;

public class UserDefined {

	public static void main(String[] args) {
		int i = 9;
		int j = 10;
		
		try {
		int k = i/j;
		
		if (k == 0) {
			throw new DevilException("This is not possible");
		}
		
		System.out.println(k);
		}
		catch(DevilException e) {
			System.out.println("Error " + e.getMessage());
		}
		
		

	}

}
