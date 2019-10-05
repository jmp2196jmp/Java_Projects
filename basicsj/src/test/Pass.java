package test;

import java.util.Scanner;

public class Pass {

	public static void main(String[] args) {
		int lim,i,c=0;
		int []h = new int[10];
		Scanner hs=new Scanner(System.in);
		System.out.println("enter the number of students");
		lim=hs.nextInt();
		System.out.println("enter the marks of students");
		for(i=0;i<lim;i++)
		{
			h[i]=hs.nextInt();
		}
		
		for(i=0;i<lim;i++)
		{
			if(h[i]<50)
			{
				c++;
			}
		}
		System.out.println("Number of students appearing for retest is " +c);
	}

}
