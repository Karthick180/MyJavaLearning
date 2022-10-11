package exception_handling;

public class Unchecked {

	public static void main(String[] args) {
		
		try{
			int i = 9;
			int j = 0;
			int k = i/j;
			System.out.println("Output is =" + k);
		}
		catch(Exception e) { // you can specifically mention exception also
			System.out.print("Error Occured");
		}
		finally {
			System.out.println(" See you Later");
		}

	}

}
