package work3;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input=new Scanner(System.in);
   System.out.println("输入三角形三条边：");
   int a=input.nextInt();
   int b=input.nextInt();
   int c=input.nextInt();
   
   
   int z=a+b+c;
   if(a+b>c&&a+c>b&&b+c>a) {
	   System.out.println("三角形的周长为： "+z);
   }
   else
	   System.out.println("这些输入值不合法！");
	}

}
