package work3;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=1;j<=8;j++) {
			
			for(int z=1;z<=8-j;z++) {
			System.out.print("    ");
			}
		
		    for(int i=1;i<=j+1;i++) {
			if(i<=j) {
				System.out.printf("%4d",(int)Math.pow(2, i-1));
			}
			else {
				for(int y=j-2;y>=0;y--) {
					System.out.printf("%4d",(int)Math.pow(2,y));
					}
			}
		}

		System.out.println();
		}

}

}
