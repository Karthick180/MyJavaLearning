package arrays;

public class TwodArray {

	public static void main(String[] args) {
		// Two dimensional array
		int a[]= {1,2,3,4};
		int b[] = {2,4,6,8};
		int c[]= {5,6,7,8};
		int d[][] = {
				{1,2,3,4},
				{2,4,6,8},
				{5,6,7,8,9}  // jagged array
		};
		for (int i=0;i<d.length;i++) {
			for (int j=0;j<d[i].length;j++) {
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
	}
}



