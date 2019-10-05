package boxing;

import java.util.Scanner;

public class Foul {

	public static void main(String[] args) {
		int lim,i,max=0,m = 0;
		int []h = new int[10];
		Scanner hs=new Scanner(System.in);
		System.out.println("enter the number of fouls");
		lim=hs.nextInt();
		System.out.println("Enter the number of fouls made by each player ");
		for(i=1;i<=lim;i++)
		{
			h[i]=hs.nextInt();
		}
		max=h[1];
		for(i=1;i<=lim;i++)
		{
			if(h[i]<h[i+1])
			{
				max=h[i];
			}
		}
		for(i=1;i<=lim;i++)
		{
			if(max==h[i])
			{
				m=i;
				break;
			}
		}
	System.out.println("The eligible player is player no: "+m+"("+max+"fouls)");

	}

}
