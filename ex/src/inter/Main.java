package inter;

interface Family
{  
  int num=3;
 String name="Tom";
   void details(); 
}
interface College
{ 
  int rollno=14;
  String dept="CSE";
  String cname="ABC College";
 public void professional(); 
} 
class Student implements Family, College
{ 
   public void details()
   {
       System.out.println("My name: "+name);
       
   } 
   public void professional()
   {
       System.out.println("My Rollnumber: "+rollno);
       System.out.println("My department: "+dept);
       System.out.println("My College name: "+cname);
       System.out.println("There are "+num+" members in my family");
   }
 }
 public class Main
 {
   public static void main(String args[])
   { 
       Student bj = new Student(); 
       bj.details(); 
       bj.professional();
   } 
}
