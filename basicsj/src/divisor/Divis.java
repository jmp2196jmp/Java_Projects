package divisor;

import java.util.Scanner;

public class Divis {

	public static void main(String[] args) {
		int n,s=0,i;
		Scanner hs=new Scanner(System.in);
		System.out.println("enter a number");
		n=hs.nextInt();
		System.out.print("The divisors of the number are ");
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				s=s+i;
				System.out.print(i+" ");
			}
		}
		
		System.out.println("The sum of the divisors are " +s);
		if(n==s)
		{
			System.out.println("It is a perfect number");
		}
	}
}
