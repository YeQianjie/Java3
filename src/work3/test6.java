package work3;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input=new Scanner(System.in);
      System.out.print("Enter a point with two coordinates: ");
      double x=input.nextInt();
      double y=input.nextInt();
      
      double len=Math.sqrt(x*x+y*y);
      
      if(len<=10)
    	  System.out.println("Point "+"("+x+", "+y+") is in the circle");
      else
    	  System.out.println("Point "+"("+x+", "+y+") is not in the circle");
	}

	
}
