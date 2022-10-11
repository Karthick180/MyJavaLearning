package break_and_continue;

public class Continue {

	public static void main(String[] args) {
		// Break and Continue
		for (int i=1;i<=10;i++) {
			if (i==7) {
				continue; // skip the remaining statements, move to next iteration.
			}
			System.out.println("value of i is : "+ i);
		}

	}

}
