package work3;

import java.text.NumberFormat;
import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Loan Amount:");
		double amount=input.nextDouble();
		System.out.print("Number of Years:");
		int years=input.nextInt();
		System.out.println("Interest Rate   Monthly Payment    Total Payment");
		
		
		for(int i=0;i<=24;i++) {
			double rate;
			rate=(0.05+0.00125*i)/12;
			double monthlypayment=(amount*rate)/(1-1/Math.pow(1+rate, years*12));
		    double totalpayment=monthlypayment*years*12;
		    NumberFormat format=NumberFormat.getPercentInstance();
		    format.setMinimumFractionDigits(3);
			System.out.print(format.format(rate));
			System.out.print("             ");
			System.out.print(String.format("%.2f",monthlypayment));
			System.out.print("             ");
			System.out.print(String.format("%.2f",totalpayment));
			System.out.println();
			
		}
	}

}
