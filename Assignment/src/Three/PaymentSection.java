package Three;

class basics {
	String Name;
	String CollegeName ;
	long Number ;
	double Amount;
	String DOB ;
String Mobile ;
	basics () 
	        {
		Name = "Anshul Sharma";
		CollegeName="LPU";
		DOB = "17-05-2000";
		Mobile ="9877449284";
			}
void show() {
System.out.println("Name = " + Name);
System.out.println("CollegeName = " + CollegeName);
System.out.print("Mobile No = " + Mobile);
System.out.print("DOB = " + DOB);
System.out.println("Number = " + Number + " "+ " Amount = "+ Amount);
System.out.println("End of parent");

}}

class fees extends basics {
	fees(){}
	void show() {
		System.out.println("Welcome To Fees Section");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		Number = 11701346;
		Amount = 41500.0;
		System.out.println("Name = " + Name);
		System.out.println("CollegeName = " + CollegeName);
		System.out.println("Mobile No = " + Mobile);
		System.out.println("DOB = " + DOB);
		System.out.println("Number = " + Number + "|"+ " Amount = "+Amount);
		System.out.println("Payment Sucessfull");
		System.out.println();
		
		}}

class recharge extends  basics {
	String Operator  ;
	double Amount;
	recharge(){
		Operator = "JIO";
		Amount = 10.0;
	}
	void show() {
		System.out.println("Welcome To Recharge Section");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Mobile No = " + Mobile);
		System.out.println("Operator = " + Operator);
		System.out.println("Amount = " +Amount);
System.out.println("Payment Sucessfull");
		System.out.println();
	}}
class dthrecharge extends  basics {
		String Operator  ;
		double Amount;
		dthrecharge(){
		    Number = 295587424;
			Operator = "Tata Sky ";
			Amount = 299.0;
		}
		void show() {
			System.out.println("Welcome To DTH - Recharge Section");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("ServiceNo = " + Number);
			System.out.println("Operator = " + Operator);
			System.out.println("Amount = " +Amount);

		System.out.println("Payment Sucessfull");
		System.out.println();
			
		}}

public class PaymentSection {

	public static void main (String[] args) {
		fees f = new fees();
		recharge r = new recharge();
		dthrecharge dth = new  dthrecharge();
		f.show();
		r.show();
		dth.show();

	}

}
