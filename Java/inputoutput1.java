import java.io.*;

class inputoutput1
{
    public static void main(String n[]) throws Exception
    {
    InputStreamReader i = new InputStreamReader(System.in);

    BufferedReader b = new BufferedReader(i);

    System.out.println("Enter any Character");

    char c = (char) b.read();

    System.out.println("Entered Character is "+ c);
    
    }
}
