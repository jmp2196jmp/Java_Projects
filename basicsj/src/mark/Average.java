package mark;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int lim,i,sum=0,av;
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
			sum=sum+h[i];
		}
av=sum/lim;
System.out.println("the average is " +av);
	}

}
