package work3;

public class test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int number=0;
		for(int year=101;year<=2100;year++) {
			if(year%4==0&&year%100!=0||year%400==0) {
				System.out.print(year+" ");
				i=i+1;
		}
			if(i==10) {
				System.out.println();
				i=0;
			}
			number=number+1;
	}
		System.out.println();
		System.out.print("闰年的数目为:"+number);
}
}
