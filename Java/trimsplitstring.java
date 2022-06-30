public class trimsplitstring {
    public static void main(String args[])
    {
        String s1="      NIHANTH NAIDU       ";
        String s2="nihanth naidu";

        String n1=s1.trim();
        String n2[]=s2.split("i");

        System.out.println("Trimmed string: "+n1);
        System.out.println(n2.length);

        for(int i=0;i<n2.length;i++)
        {
            System.out.println(n2[i]);
        }
    }
    
}
