import java.util.Scanner;
public class startendstring {
    public static void main(String n[])
    {
        Scanner s= new Scanner(System.in);

        String s1="Nihanth";

        System.out.println("Enter starting string");

        boolean se1=s1.startsWith(s.next());

        System.out.println("Enter ending string");

        boolean se2=s1.endsWith(s.next());


        System.out.println("Given String starting is "+se1);
        System.out.println("Given String ending is "+se2);
    }
}
