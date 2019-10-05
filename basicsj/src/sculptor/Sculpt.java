package sculptor;

import java.util.Scanner;

public class Sculpt {

	public static void main(String[] args) {
		int n,t;
		Scanner hs=new Scanner(System.in);
		System.out.println("Enter the kgs of gold");
		n=hs.nextInt();
		t=n;
		while(n>5)
		{
			n=n/5;
			t=t+n;
		}
System.out.println("Number of Sculptors can be made is "+t);
	}

}
