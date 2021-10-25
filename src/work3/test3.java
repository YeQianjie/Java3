package work3;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int lottery=(int)(Math.random()*900)+100;
       
       Scanner input=new Scanner(System.in);
       System.out.print("Enter your lottery pick(three digits): ");
       int guess=input.nextInt();
       
       int lottreyDigit1=lottery/100;
       int lotteryDigit2=lottery/10%10;
       int lotteryDigit3=lottery%10;
       
       int guessDigit1=guess/100;
       int guessDigit2=guess/10%10;
       int guessDigit3=guess%10;
       
       System.out.println("The lottery number is "+lottery);
       
       if(guess==lottery)
    	   System.out.println("Exact match:you win $10,000");
       else if((guessDigit1==lottreyDigit1||guessDigit1==lotteryDigit2||guessDigit1==lotteryDigit3)&&(guessDigit2==lottreyDigit1||guessDigit2==lotteryDigit2||guessDigit2==lotteryDigit3)&&(guessDigit3==lottreyDigit1||guessDigit3==lotteryDigit2||guessDigit3==lotteryDigit3)) {
    	  System.out.println("Match all digits:you win $3,000"); 
       }
       else if((guessDigit1==lottreyDigit1||guessDigit1==lotteryDigit2||guessDigit1==lotteryDigit3||guessDigit2==lottreyDigit1||guessDigit2==lotteryDigit2||guessDigit2==lotteryDigit3||guessDigit3==lottreyDigit1||guessDigit3==lotteryDigit2||guessDigit3==lotteryDigit3)) {
    	   System.out.println("Match one digits:you win $1,000");
       }
       else
    	   System.out.println("Sorry,no match");
    	   
       
	}

}
