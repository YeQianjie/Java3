package work3;


public class test28 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		  double[] numbers=new double[]{1.5,5,8,2.3,3,9,4,5.8,8,6.9};
	        //�����length-1��ð��
	        for(int i=0;i<numbers.length-1;i++)
	        {
	            for(int j=0;j<numbers.length-1-i;j++)
	            {
	                if(numbers[j]>numbers[j+1])
	                {
	                    double temp=numbers[j];
	                    numbers[j]=numbers[j+1];
	                    numbers[j+1]=temp;
	                }
	            }
	        }
	        System.out.println("��С���������Ľ����:");
	        for(int i=0;i<numbers.length;i++)
	            System.out.print(numbers[i]+" ");
	    }
	

	}



