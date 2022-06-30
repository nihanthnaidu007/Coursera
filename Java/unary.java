public class unary {
    public static void main(String n[])
    {
        byte x=8;
        System.out.println("Result of unary minus"+(-x));
        System.out.println("Before pre increment x is"+x);
        System.out.println("Pre increment is"+(++x));
        System.out.println("Resuslt of pre increment"+x);
        System.out.println("Before post increment x is"+x);
        System.out.println("Post increment is"+(x++));
        System.out.println("Result of post increment"+(x));
        System.out.println("Before pre decrement x is"+x);
        System.out.println("Pre decrement is"+(--x));
        System.out.println("Result of pre decrement x is"+x);
        System.out.println("Before post decrement x is"+x);
        System.out.println("Post decrement is"+(x--));
        System.out.println("Result of post decrement"+(x));
    }
}
