package institute;
import java.util.*;
public class Main {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int bs=s.nextInt();
		if(bs>0)
		{
			Faculty f=new Faculty();
			f.salary(bs);
		CSE c=new CSE();
	c.salary(bs);
		IT i=new IT();
		i.salary(bs);
		 ECE e = new ECE();
		 e.salary(bs);
		}
		else {
			System.out.println("null");
		}
	}

}
class Faculty
{
  public void salary(int bs)
  {
   System.out.println("Base Salary:"+bs);
  }
}
class CSE extends Faculty
{
  public void salary(int bs)
  {
	  System.out.println("CSE Faculty:"+(bs+3000)); 
  }
}
class IT extends CSE
{
  public void salary(int bs)
  {
	  System.out.println("IT Faculty:"+(bs+5000));
  }
}
class ECE extends IT
{
  public void salary(int bs)
  {
	  System.out.println("ECE Faculty:"+(bs+4500));
  }
}
