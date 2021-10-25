package work3;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates:");
		double x=input.nextDouble();
		double y=input.nextDouble();
		
		double number=(-0.5)*x+100;
		
		if(x>=0&&x<=200&&y>=0&&y<=100&&y<=number)
			System.out.print("The point is in the triangle");
		else
			System.out.print("The point is not in the triangle");
			
	}
	
	

}
