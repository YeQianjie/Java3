package work3;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of lines:");
		int number=input.nextInt();
	
		for(int i=1;i<=number;i++){
			
            for(int j=1;j<=number-i;j++){
                System.out.print("  ");
            }
            
            for(int k=-(i-1);k<=i-1;k++){
                System.out.print(Math.abs(k)+1+" ");
            }
            
            System.out.println();//·ÖÐÐÊä³ö£»
            
        }
	}

}
