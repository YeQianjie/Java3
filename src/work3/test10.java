package work3;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter r1's center x-,y-coordinates,width,and height:");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double width1=input.nextDouble();
		double height1=input.nextDouble();
		System.out.print("Enter r2's center x-,y-coordinates,width,and height:");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double width2=input.nextDouble();
		double height2=input.nextDouble();
		
		
		if(x1+width1/2>x2+width2/2&&x1-width1/2<x2-width2/2&&x1+height1/2>x2+height2/2&&x1-height1/2<x2-height2/2)
			System.out.print("r2 is inside r1");
		else if(x1+width1/2<x2-width2/2||x1-width1/2>x2+width2/2&&x1+height1/2<x2-height2/2||x1-height1/2>x2+height2/2)
			System.out.print("r2 overlaps r1");
		else
			System.out.print("r2 does not overlap r1");
		
	}

}
