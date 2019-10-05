package bowlers;

import java.util.Scanner;

public class Ipl {

	public static void main(String[] args) {
		int lim,i,ec,ov;
		float sum=0;
		int []h = new int[10];
		int []m=new int[10];
float []e=new float[10];
		Scanner hs=new Scanner(System.in);
		System.out.println("enter the number of bowlers");
		lim=hs.nextInt();
		System.out.println("Enter the runs conceded by the bowlers");
		for(i=0;i<lim;i++)
		{
			h[i]=hs.nextInt();
		}
		System.out.println("Enter the number of balls for each bowler");
		for(i=0;i<lim;i++)
		{
			m[i]=hs.nextInt();
		}
		System.out.println("Economy of the bowlers is");
		for(i=0;i<lim;i++)
		{
		e[i]=(float)h[i]/(m[i]/6);
		sum=sum+e[i];
		        System.out.println(e[i]);
		}
		float x=sum/lim;
		System.out.println("The overall economy of the teanm is"+""+x);
		      int count=0;
		for(i=0;i<lim;i++)
		{
		if(e[i]<=x)
		count++;
		}
		System.out.println("The number of bowlers eligible are "+""+count);


		}
}
