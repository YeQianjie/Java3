package work3;

import java.util.Scanner;

public class test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int flag=0;
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the size of the list: ");
			int size=input.nextInt();
			System.out.print("Enter the contents of the list: ");
			int[] list=new int[size];
			for(int i=0;i<size;i++) {
				list[i]=input.nextInt();
			}
			System.out.print("The list has "+size+" integers ");
			for(int i=0;i<size;i++) {
				System.out.print(list[i]+" ");
			}
			System.out.println();
			for(int i=0;i<list.length-1;i++)
	        {
	            for(int j=0;j<list.length-1-i;j++)
	            {
	                if(list[j]>list[j+1])
	                {
	                   flag=0;
	                  
	                   break;
	                }
	                else
	                	flag=1;
	            }
	        }
			if(flag==1)
				System.out.println("The list is already sorted");
			else
				 System.out.println("The list is not sorted");
	}

}
