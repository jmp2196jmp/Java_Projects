package telephone;
interface Telephone 
{
    void callPhone(int phoneNumber);
    void dial(int phoneNumber);
    void answer();
}
class DeskPhone implements Telephone 
{
    private int myNumber;
    private boolean isRinging;
    public DeskPhone(int myNumber) 
    {
        this.myNumber = myNumber;
    }
    public void callPhone(int phoneNumber) 
    {
        if(phoneNumber == myNumber) 
        {
            isRinging = true;
            System.out.println("Ring ring");
        } 
        else 
        {
            isRinging = false;
        }
    }
    public void dial(int phoneNumber) 
    {
        System.out.println("Now ringing " + phoneNumber);
    }
    public void answer() 
    {
        if(isRinging) 
        {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }
}
class Main 
{
    public static void main(String[] args) 
    {
        DeskPhone d = new DeskPhone(123456);
        d.callPhone(123456);
        d.dial(123456);
        d.answer();
    }
}
