package work3;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=(int)Math.random()*52+1;
		System.out.print("The card you picked is ");
		
		if(number%13==1)
			System.out.print("Ace of ");
		else if(number%13==11)
			System.out.print("Jack of ");
		else if(number%13==12)
			System.out.print("Queen of ");
		else if(number%13==0)
			System.out.print("King of ");
		else
			System.out.print((number%13)+"of ");
		
		if (number / 13 == 0)
			System.out.println("Clubs");
		else if (number / 13 == 1)
			System.out.println("Diamonds");
		else if (number / 13 == 2)
			System.out.println("Hearts");
		else if (number / 13 == 3)
			System.out.println("Spades");
		
	}

}
