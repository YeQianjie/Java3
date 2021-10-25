package work3;

import java.util.Scanner;

public class test27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 numbers:");
			double[] number=new double[11];
			int i;
			double sum=0;
			double mean=0;
			double stand=0;
			double sum2=0;
			double sum3=0;
			double sum4=0;
			for(i=1;i<=10;i++) {
				number[i]=input.nextDouble();
				sum+=number[i];
			}
			mean=sum/10;
			System.out.print("The mean is "+mean);
			System.out.println();
			for(i=1;i<=10;i++) {
				sum2+=Math.pow(number[i],2);
				sum3+=number[i];
				
			}
			sum4=(sum2-sum3*sum3/10)/9;
			stand=Math.sqrt(sum4);
			System.out.print("The standard deviation is "+stand);
	}

}
