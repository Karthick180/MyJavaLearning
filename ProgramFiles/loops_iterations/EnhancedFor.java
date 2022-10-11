package loops_iterations;

public class EnhancedFor {

	public static void main(String[] args) {
		// Enhanced for (or) foreach
		int a[]= {1,2,3,4,5};
		int d[][] = {
				{1,2,3,4},
				{2,4,6,8},
				{5,6,7,8,9}  // jagged array
		};
//		for (int k : a) {
//			System.out.println(k);
//		}
		
		for (int k[]:d)
		{
			for (int l:k)
			{
				System.out.print(" "+l);
			}
			System.out.println();
		}
		

	}

}
