package work3;

import java.util.Scanner;

public class test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String er = " ";
         Scanner sc = new Scanner(System.in);
         System.out.print("������һ��ʮ����������");
         int s  = sc.nextInt();
         while (s>0){
             er = ( s % 2) +er;
             s = s/2;
         }
         System.out.println("�����Ʊ�ʾΪ��"+er);

    }
}


