public class logical {
    
    public static void main(String args[])
    {
        byte x,y,z;
        x=20;
        y=30;
        z=40;

        if((x<z) && (x<y))
        System.out.println("X is smaller than both x and y");

        if((x<y) || (x<z))
        System.out.println("X is smaller than either y or z");
     
        if(!(x>y))
        System.out.println("X is greater than y");
    }
}
