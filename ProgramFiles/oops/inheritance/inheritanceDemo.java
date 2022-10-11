package oops.inheritance;

class Calc // Super class , Parent Class , base
{
	public int add(int i, int j) 
	{
		return i+j;
	}
}
class CalcAdv extends Calc // Sub class , Child class , derived
{
//	public int add(int i, int j) {
//	return i+j;	
//	}
	public int sub(int i, int j) {
		return i-j;	
		}
}

class CalcVeryAdv extends CalcAdv
{
	public int mul(int i, int j) {
		return i*j;
	}
}

public class inheritanceDemo {

	public static void main(String[] args) {
		CalcVeryAdv c1 = new CalcVeryAdv();
//		CalcAdv c1 = new CalcAdv();
//		CalcVeryAdv c1 = new CalcVeryAdv();
		
		
		int result1 = c1.add(6,11);
		int result2 = c1.sub(6,1);
		int result3 = c1.mul(8, 3);
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
