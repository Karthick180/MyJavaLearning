package exception_handling;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckedDeepDive {

	public static void main(String[] args) throws Exception{
		int n = 0;
		System.out.println("Enter a number : ");
		//Exception handling Try with resource
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) 
		{
		n = Integer.parseInt(br.readLine());
		}
		
		
		System.out.println(n);
		

	}

}
