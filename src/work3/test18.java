package work3;

public class test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=10000;
		double e=1;
		double item=1;
		for(int k=2;k<=11;k++) {
			for(double i=1;i<=j;i++) {
				item=item*i;
				e=e+1/item;
				
			}
			j=10000*k;
			System.out.println(e);
		}
	}
	

}
