package mobile;
import java.util.*;

public class Test
{

	public static void main(String args[])
	  {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    ArrayList<Integer> marks = new ArrayList<Integer>();
	    for(int i =0; i<n; i++)
	     {
	      int m = in.nextInt();
	      marks.add(m);
	     }
	    ArrayList<Integer> s = (ArrayList<Integer>) marks.clone();
	    Collections.sort(s);
	    System.out.println("Actual List"+marks);
	    System.out.println("Sorted Marks");
	    for(int i =0; i<n; i++)
	      System.out.println(s.get(i));
	  }
}