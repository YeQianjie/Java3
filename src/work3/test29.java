package work3;

import java.util.Scanner;

public class test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			System.out.print("Enter 10 numbers:");
			int[] number=new int[10];
			int[] number2=new int[10];
			int i;
			int j;
			int c=0;
			for(i=0;i<number.length;i++) {
				number[i]=input.nextInt();
			}
			
			for(i=0;i<number.length;i++) {
				for(j=i+1;j<number.length;j++) {
					if(number[i]==number[j])
					{
						number[j]=0;//������forѭ��,��������������ǰ�����,�ͰѺ���ĸ�ֵΪ0;
					}

				}
					
			}
			for(i=0,j=0;i<number.length;i++)
			{
				if(number[i]!=0)
				{
					number2[j]=number[i];//��������һ���µ�����,Ȼ����˵�0;
					/*record[i]=nember[i];���ﲻ����ôд����Ϊ����Ĭ�ϵ�ֵΪ0�������丳ֵ����ľ���0,�Ͳ���1 2 3 6 4 5�����м���0*/
					j++;
					c++;//��¼�м�����ͬ����;
				}
			}

			System.out.println("The number of distinct numbers is "+c);
			System.out.print("The distinct numbers are: ");
			for(j=0;j<c;j++) {
			System.out.print(number2[j]+" ");
	}

}
}
