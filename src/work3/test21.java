package work3;

import java.util.Scanner;

public class test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int i,j,month_total_days,month=1;
		System.out.print("year  :  ");
		int year=input.nextInt();
		System.out.print("The first day of this year is  :  ");
		int weekday=input.nextInt();
		
	
			
			for (month=1;month<=12;month++)
			{
				switch(month)
				{
					case 1:
				  System.out.println("\t\t\t"+"January"+" "+year);
				  break;
				  case 2:
				  System.out.println("\t\t\t"+"Februry"+" "+year);break;
				  case 3:
				  System.out.println("\t\t\t"+"March"+" "+year);break;
				  case 4:
				  System.out.println("\t\t\t"+"April"+" "+year);break;
				  case 5:
				  System.out.println("\t\t\t"+"May"+" "+year);break;
				
				  case 6:
				    System.out.println("\t\t\t"+"June"+" "+year);break;
				 
				  case 7:
				   System.out.println("\t\t\t"+"July"+" "+year);break;
				  
				  case 8:
				  System.out.println("\t\t\t"+"August"+" "+year);break;
				 
				  case 9:
				   System.out.println("\t\t\t"+"September"+" "+year);break;
				 
				  case 10:
				   System.out.println("\t\t\t"+"October"+" "+year);break;
				 
				  case 11:
				  System.out.println("\t\t\t"+"November"+" "+year);break;
				  case 12:
				  System.out.println("\t\t\t"+"December"+year);break;
				  default: break;
				}
			
		    System.out.println("———————————————————————————————————————————————————");
		     System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
	
			
				 if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
					month_total_days=31;
				else if(month==2)
				{
						if(((year % 4 ==0 && year % 100!=0)||(year %400 ==0)))
							//如果某年可以被4整除而不能被100整除，或者可以被400整除，那么这一年就是闰年
						month_total_days=29;
							else 
							month_total_days=28;
				}
				else
					month_total_days=30;
				

				weekday=(printf(month_total_days,weekday))%7;
				
			}
	}
					public static int printf(int month_total_days,int weekday)
	{
		int flag=0,i;
		  for( i=0;i<weekday%7;i++)
				{
					System.out.print("\t");//该循环用于输出第一行的空格个数,  //星期几，就有几个\t
					flag+=1;//计数是否满7个数，每满7个位置就换行
				}
	
		for( int j=1;j<=month_total_days;j++)
		{	
		   System.out.print(j);
			flag++;
			if(flag%7==0){
			System.out.println();
			}
			
		else
			System.out.print("\t");
		
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		return flag;
		

		
	}

}
