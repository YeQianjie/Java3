package work3;

public class test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=10000;
		double pi=0;
		double sum=0;
		for(int k=2;k<=11;k++) {
			sum=0;
				for(int i=1;i<=j;i++) {
				sum+=Math.pow(-1, i+1)/(2*i-1);
				pi=4*sum;
			}
				j=10000*k;
				 System.out.println(pi);
			
	}
			
           

}
}