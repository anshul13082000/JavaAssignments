package Problem;

public class ShiftOpNeg {

	public static void main(String[] args) {
		
		//Negative Shift works same as +ve one
//		 In Java, the operator ‘>>’ is signed right shift operator. 
//		 All integers are signed in Java, and it is fine to use >> for negative numbers.
		int a = -4;
		int b = a << 2;
		System.out.println(b); 
		
		int a1 = -8;
		int b1 = a1 >> 2;
		System.out.println(b1); 

	}

}
