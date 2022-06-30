import java.util.*;

public class inputoutput5 {
    private static Scanner s;

    public static void main(String n[]) throws Exception
    {
        s = new Scanner(System.in);// Actually this line should be written as Scanner s = new Scanner(System.in) its modified according to VS code

        System.out.println("Enter the First Number");

        int firstnumber=s.nextInt();

        System.out.println("Enter the Second Number");

        int secondnumber=s.nextInt();

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
