import java.io.*;
public class inputoutput4 {
    public static void main (String n[]) throws Exception
    {
        InputStreamReader i = new InputStreamReader(System.in);

        BufferedReader b = new BufferedReader(i);

        System.out.println("Enter the First Number");

        int firstnumber = Integer.parseInt(b.readLine());

        System.out.println("Enter the second number");

        int secondnumber = Integer.parseInt(b.readLine());

        int result1 = firstnumber+secondnumber;
        int result2 = firstnumber-secondnumber;
        int result3 = firstnumber*secondnumber;
        int result4 = firstnumber/secondnumber;
        int result5 = firstnumber%secondnumber;

        System.out.println("Result of Addition "+result1);
        System.out.println("Result of Substraction "+result2);
        System.out.println("Result of Multiplication "+result3);
        System.out.println("Result of Division "+result4);
        System.out.println("Result of Modulus "+result5);

    }
    
    
}
