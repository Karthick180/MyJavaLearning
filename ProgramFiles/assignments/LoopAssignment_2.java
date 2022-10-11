package assignments;

public class LoopAssignment_2 {

	public static void main(String[] args) {
		for (int i=1;i<=4;i++) {
			for (int j1=1;j1<=4;j1++) {
				if (( i==1 || i==4) || (j1==1 || j1==4)) {
					System.out.print("1");
				}
				else
					System.out.print(" ");
					
			}
			System.out.println(" ");
		}

	}

}
