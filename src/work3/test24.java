package work3;

import java.util.Scanner;

public class test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        int[] d=new int[11];
        int sum=0;
       
        for(int i=1;i<=9;i++) {
        	if(i==1)
        		d[1]=(number/100000000)*1;
        	else
        		d[i]=(number/(int)(Math.pow(10,(9-i))))%10;
        	sum+=d[i]*i;
        }
        d[10]=sum%11;
        if(d[10]==10)
            System.out.println("The ISBN-10 number is:"+d[1]+d[2]+d[3]+d[4]+d[5]+d[6]+d[7]+d[8]+d[9]+'X');
         else
         	System.out.println("The ISBN-10 number is:"+d[1]+d[2]+d[3]+d[4]+d[5]+d[6]+d[7]+d[8]+d[9]+d[10]);
         	
	}

}
