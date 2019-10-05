package tollg;

import java.util.Scanner;

public class Toll {

	public static void main(String[] args) {
		int lim,i,c=0,g=0;
		int []h = new int[10];
		Scanner hs=new Scanner(System.in);
		System.out.println("enter the number of vehicles");
		lim=hs.nextInt();
		System.out.println("Enter the fare collected for each vehicles");
		for(i=0;i<lim;i++)
		{
			h[i]=hs.nextInt();
		}
		for(i=0;i<lim;i++)
		{
		if(h[i]>50)
		{
			c++;
		}
		else if((h[i]!=0) &&( h[i]<50))
		{
			g++;
		}
		}
		System.out.println("Number of heavy vehicles " +c+ "and the number of light weight vehicles is "+g);
	}

}
