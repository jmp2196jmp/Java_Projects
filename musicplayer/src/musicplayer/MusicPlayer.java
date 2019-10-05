package musicplayer;

import java.util.Scanner;

public class MusicPlayer
{

	public static void main(String[] args)
	{
		int bl,ts,sn=1;
		 System.out.println("Enter battery level and the total number of songs :");
	        Scanner inp= new Scanner(System.in);
	        bl = inp.nextInt();
	        ts = inp.nextInt();
	       
	        	while(bl>30)
	        	{
	        		System.out.println("Music On ");
	        	       System.out.println("Playing Song: "+sn);
inp.nextLine();
do
{
	 System.out.println("Do you want to play again?: Yes/No");
     String rep = inp.nextLine();
     if(rep.equals("Yes"))
      System.out.println("Playing Song: "+sn);
    else if(!(rep.equals("No")))
       System.out.println("Invalid input string!!Enter Yes/No correctly!!");
    else if(sn < ts)
     {
      System.out.println("Do you want to continue with next song?: Yes/No");
      String nextSong = inp.nextLine();
      if(nextSong.equals("No"))
       break;
      else
      System.out.println("Playing song: "+(++sn));
    }
     bl -= 5;
   }while(sn < ts && bl > 30);
  if(bl <= 30)
  break;
  System.out.println("Do you want to Stop Music?:Yes/No");
  String stop = inp.next();
  if(stop.equals("Yes"))
    break;
  else if(sn >= ts)
  {
    System.out.println("RESTARTING");
    sn = 1;
  }
  else
      System.out.println("RESUME");
  
  bl -= 5;
 }
 if(bl <= 30)
 System.out.println("Low Battery!");
 System.out.println("Music Player Stopped!");
}
} 





