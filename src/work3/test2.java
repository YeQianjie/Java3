package work3;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,d10;
		int d1,d2,d3,d4,d5,d6,d7,d8,d9;
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        
        d9=number%10;
        d8=number/10%10;
        d7=number/100%10;
        d6=number/1000%10;
        d5=number/10000%10;
        d4=number/100000%10;
        d3=number/1000000%10;
        d2=number/10000000%10;
        d1=number/100000000;
        
        
        d10=(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
       
        if(d10==10)
           System.out.println("The ISBN-10 number is:"+d1+d2+d3+d4+d5+d6+d7+d8+d9+'X');
        else
        	System.out.println("The ISBN-10 number is:"+d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);
        	
	}

}
