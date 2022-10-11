package exception_handling;

public class UncheckedDeepDive {

	public static void main(String[] args) {
		try
		{
			int a[] = new int[5];
			a[4] = 9;
			int b = 9;
			int c = 0;
			int d = b/c;
			
			
		}
		catch(NullPointerException e)
		{
			System.out.println(" Array cannot be null");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Limit is 5, Stay within that limit");
		}
		catch(Exception e) {
			System.out.println("Something went wrong, check your side");
		}
		finally {
			System.out.println("Good to see you..");
		}
		
		

	}

}
