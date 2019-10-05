package physical;

import java.util.Scanner;

public class Heights {

	public static void main(String[] args) {
		int lim,i,j;
		double []h = new double[10];
		Scanner hs=new Scanner(System.in);
		System.out.println("enter the number of students");
		lim=hs.nextInt();
		System.out.println("enter the heights of students");
		for(i=0;i<lim;i++)
		{
			h[i]=hs.nextDouble();
		}
for(i=lim-1;i>0;i--)
{
	for(j=lim-1;j>=1;j--)
	{
		if(h[j-1]>h[j])
		{
		double t=h[j-1];
		h[j-1]=h[j];
		h[j]=t;
}
	}
	
}
System.out.println("the heights in order");
		for(i=0;i<lim;i++)
		{
		System.out.println(h[i]);
		}
		
	}

}
