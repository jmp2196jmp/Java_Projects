package leap;

import java.util.Scanner;

public class Lyear {

	public static void main(String[] args) {
		int y;
		Scanner hs=new Scanner(System.in);
		System.out.println("Enter a year");
		y=hs.nextInt();
		if((y%4==0)&&(y%400==0))
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("It is not a leap year");
		}

	}

}
