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
						number[j]=0;//用两个for循环,如果后面的数等于前面的数,就把后面的赋值为0;
					}

				}
					
			}
			for(i=0,j=0;i<number.length;i++)
			{
				if(number[i]!=0)
				{
					number2[j]=number[i];//将它赋给一个新的数组,然后过滤掉0;
					/*record[i]=nember[i];这里不能这么写，因为数组默认的值为0，不给其赋值输出的就是0,就不是1 2 3 6 4 5而是中间有0*/
					j++;
					c++;//记录有几个不同的数;
				}
			}

			System.out.println("The number of distinct numbers is "+c);
			System.out.print("The distinct numbers are: ");
			for(j=0;j<c;j++) {
			System.out.print(number2[j]+" ");
	}

}
}
