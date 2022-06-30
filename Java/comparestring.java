public class comparestring {
    public static void main(String args[])
    {
        String s1="Nihanth";
        String s2="nihanth";

        boolean c1=s1.equals(s2);
        boolean c2=s1.equalsIgnoreCase(s2);

        System.out.println("Compare String "+c1);
        System.out.println("Compare String "+c2);

    }
}
