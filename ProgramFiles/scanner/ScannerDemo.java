package scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		System.out.println(n);
	}

}
