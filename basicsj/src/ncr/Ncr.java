package ncr;

import java.util.Scanner;

public class Ncr {

	public static void main(String[] args) {
		int i;
		long s=1,nf=1,rf=1,m,n,r;
		Scanner hs=new Scanner(System.in);
		System.out.println("enter the value of n");
		n=hs.nextInt();
		System.out.println("enter the value of r");
		r=hs.nextInt();

for(i=1;i<=n;i++)
{
	nf=nf*i;
}
for(i=1;i<=r;i++)
{
	rf=rf*i;
}
for(i=1;i<=(n-r);i++)
{
	s=s*i;
}
m=nf/(rf*s);
System.out.println("The NCR factor for given values is "+m);

	}

}
