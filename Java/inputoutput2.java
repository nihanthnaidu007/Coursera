import java.io.*;

public class inputoutput2 {
    public static void main(String n[]) throws Exception
        {
            InputStreamReader i = new InputStreamReader(System.in);
        
            BufferedReader b = new BufferedReader(i);
        
            System.out.println("Enter any Character");
        
            System.out.println("ASCII Value is "+ b.read());
            
        }
}
