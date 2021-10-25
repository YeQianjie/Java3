package work3;

import java.util.Scanner;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Loan Amount:");
		double amount=input.nextDouble();
		System.out.print("Number of Years:");
		int years=input.nextInt();
		System.out.print("Annual Interest Rate:");
		double rate=input.nextDouble();
		System.out.println();
		
		
		double monthlypayment=(amount*(rate/1200))/(1-1/Math.pow(1+rate/1200, years*12));
	    double totalpayment=monthlypayment*years*12;
		System.out.println("Monthly Payment:"+String.format("%.2f",monthlypayment));
		System.out.println("Total Payment:"+String.format("%.2f",totalpayment));
		System.out.println();
		System.out.println("Payment#         Interest             Principal             Balance");
		for(int i=1;i<=years*12;i++) {
			double interest;
			double principal;
			
			interest=(rate/1200)*amount;
			principal=monthlypayment-interest;
			amount=amount-principal;
			System.out.print(i);
			if(i>=10)
			System.out.printf("               ");
			else
				System.out.printf("                ");
			System.out.printf(String.format("%.2f",interest));
			if(i>=10)
				System.out.printf("                ");
				else
					System.out.printf("                ");
			System.out.printf(String.format("%.2f",principal));
			if(i>=10)
				System.out.printf("                ");
				else  
					System.out.printf("                ");
			System.out.printf(String.format("%.2f",amount));
			System.out.println();
			
		}
		
	}

}
