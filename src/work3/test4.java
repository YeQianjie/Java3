package work3;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input=new Scanner(System.in);
   System.out.println("���������������ߣ�");
   int a=input.nextInt();
   int b=input.nextInt();
   int c=input.nextInt();
   
   
   int z=a+b+c;
   if(a+b>c&&a+c>b&&b+c>a) {
	   System.out.println("�����ε��ܳ�Ϊ�� "+z);
   }
   else
	   System.out.println("��Щ����ֵ���Ϸ���");
	}

}
