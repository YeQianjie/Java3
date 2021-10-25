package work3;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input=new Scanner(System.in);
   System.out.print("Enter year:(e.g.,2012): ");
   int year=input.nextInt();
   System.out.print("Enter month:1-12: ");
   int month=input.nextInt();
   System.out.print("Enter the day of the month:1-31: ");
   int day=input.nextInt();
   
   if(month==1) {
	   month=13;
	   year=year-1;
   }
   if(month==2) {
	   month=14;
	   year=year-1;
   }
   
   int h=(day+(int)(26*(month+1)/10)+(int)(year%100)+(int)(year%100/4)+(int)year/400+(int)year/20)%7;
   if(h==0)
	   System.out.println("Day of the week is Saturday");
   if(h==1)
	   System.out.println("Day of the week is Sunday");
   if(h==2)
	   System.out.println("Day of the week is Monday");
   if(h==3)
	   System.out.println("Day of the week is Tuesday");
   if(h==4)
	   System.out.println("Day of the week is Wednesday");
   if(h==5)
	   System.out.println("Day of the week is Thursday");
   if(h==6)
	   System.out.println("Day of the week is Friday");
   
	}

}
