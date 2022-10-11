package variables;

public class variablesDemo {

	public static void main(String[] args) {
		// int, float, double
		
		long l = 5l; // 8 bytes
		int i = 5; // 4 byte -> 32 bits
		short s = 5; //2 byte -> 16 bits
		byte b = 5; //1 byte -> 8 bits
		float f = 5.5f;
		double d = 5.5;
		
		
		char c = 'A';
		c = 66; // American Standard code for information interchange
		System.out.println(c);
		
		
		double d1 = 5; //implicit conversion
		int k = (int) 5.5; // type casting
		System.out.println(k);
		

	}

}
