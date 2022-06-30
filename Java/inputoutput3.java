import java.io.*;

public class inputoutput3 {
    public static void main (String n[]) throws Exception
    {
        InputStreamReader i = new InputStreamReader(System.in);

        BufferedReader b = new BufferedReader(i);

        System.out.println("Enter the characters");

        String s = b.readLine();

        System.out.println("Entered characters are "+s);

    }
    
}
