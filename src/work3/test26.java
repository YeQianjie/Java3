package work3;

import java.util.Scanner;

public class test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��ʮ���Ƶ�����:");
		int num=input.nextInt();
		int k = 0,i = 0;
			while(num != 0)
			{
				k += num % 8 *Math.pow(10,i);
				num /= 8;
				i++;
			}
	System.out.print("���Ӧ�İ˽���Ϊ:"+k);

	}
	

}
