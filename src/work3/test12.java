package work3;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double number=10000*Math.pow(1.05,10);
      int i;
      double sum=0;
      double money;
      for(i=1;i<=4;i++) {
    	  money=10000*Math.pow(1.05, i);
    	  sum+=money;
      }
    	  System.out.println(number);
    	  System.out.println(sum);
	}

	
}

