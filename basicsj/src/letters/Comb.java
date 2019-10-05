package letters;

import java.util.Scanner;

public class Comb {

	public static void main(String[] args) {
		int n,f=1,i;
		Scanner hs=new Scanner(System.in);
		System.out.println("Enter the number alphabets in your name");
		n=hs.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("The number of combination is " +f);
	}

}
