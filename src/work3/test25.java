package work3;

import java.util.Scanner;

public class test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String er = " ";
         Scanner sc = new Scanner(System.in);
         System.out.print("请输入一个十进制整数：");
         int s  = sc.nextInt();
         while (s>0){
             er = ( s % 2) +er;
             s = s/2;
         }
         System.out.println("二进制表示为："+er);

    }
}


