package Two;

import java.util.Scanner;

public class PromoCode {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Model
		
		int KOTAK200 = 1;
		int ICICTREATS = 2;
		
		double amountToPay;
		System.out.println("Enter amount to pay:");
		amountToPay = scanner.nextDouble();
		
		
		if(amountToPay >= 399) {
			System.out.println("You are elibile for applying Promo Code");
			System.out.println("1. KOTAK200 for orders above Rs.399. 20% Off Upto 200");
			System.out.println("2. ICICTREATS for orders above Rs.499. Flat 20%");
			double kota_disc = 0.0;
			double icici_disc = 0.0;
			
			if(amountToPay >=399) {
				
				kota_disc = 0.20 * amountToPay;
			if(kota_disc > 200) {
				kota_disc = 200;
			}
				
				if(amountToPay>=499) {
				icici_disc = 0.20 * amountToPay;
				}
			}
			while(true) {
				
			int promoCode = scanner.nextInt(); 
	
			if(promoCode == ICICTREATS && amountToPay >=499) {

				System.out.println("Promo Code ICICTREATS Applied. You Got Discount worth \u20b9"+icici_disc);
				System.out.println("Please Pay: \u20b9"+(amountToPay-icici_disc));
				if(kota_disc>icici_disc) {
					System.out.println("Apply KOTAK200 for more discount");
					continue;
				}
				break;
			}else if(promoCode == KOTAK200) {

				System.out.println("Promo Code KOTAK200 Applied. You Got Discount worth \u20b9"+kota_disc);
				System.out.println("Please Pay: \u20b9"+(amountToPay-kota_disc));
				if(kota_disc<icici_disc) {
					System.out.println("Apply ICICTREATS for more discount");
					continue;
				}
				break;
			}else {
				System.out.println("Enter Valid Promo Code");
			}
			}
		}else {
			System.out.println("You are NOT elibile for applying any Promo Code");
			System.out.println("Please Pay: \u20b9"+amountToPay);
		}


	}

}
