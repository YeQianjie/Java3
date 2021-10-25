package work3;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter circle1's center x-,y-coordinates, and radius:");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double radius1=input.nextDouble();
		System.out.print("Enter circle2's center x-,y-coordinates, and radius:");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double radius2=input.nextDouble();
		
		double len=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		if(len<=Math.abs(radius1-radius2))
			System.out.print("circle2 is inside circle1");
		else if(len<=(radius1+radius2))
			System.out.print("circle2 overlaps circle1");
		else
			System.out.print("circle2 does not overlaps circle1");
		
		
	}

}
