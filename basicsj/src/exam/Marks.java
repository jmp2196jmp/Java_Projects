package exam;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		int lim,i,j,k=1;
		int []h = new int[10];
		Scanner hs=new Scanner(System.in);
		System.out.println("enter the number of students");
		lim=hs.nextInt();
		System.out.println("enter the marks of students");
		for(i=0;i<lim;i++)
		{
			h[i]=hs.nextInt();
		}
for(i=lim-1;i>0;i--)
{
	for(j=lim-1;j>=k;j--)
	{
		if(h[j-1]<h[j])
		{
		int t=h[j-1];
		h[j-1]=h[j];
		h[j]=t;
}
	}
	//k++;
}
System.out.println("the priority of marks ");
		for(i=0;i<lim;i++)
		{
		System.out.println(h[i]);
		}

	}

}
