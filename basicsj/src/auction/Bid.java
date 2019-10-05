package auction;

import java.util.Scanner;

public class Bid {

	public static void main(String[] args) {
		int lim,i,max=0;
		int []h = new int[10];
		Scanner hs=new Scanner(System.in);
		System.out.println("enter the number of applications");
		lim=hs.nextInt();
		System.out.println("enter the no. of amounts(in crores)");
		for(i=0;i<lim;i++)
		{
			h[i]=hs.nextInt();
		}
		max=h[0];
		for(i=0;i<lim;i++)
		{
			if(h[i]>h[i+1])
			{
				max=h[i];
			}
		}
	System.out.println("The winning bid is " +max+ " crores");
	}

}
