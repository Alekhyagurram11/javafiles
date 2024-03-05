class Public
{
    public int a = 100;
    protected int b = 200;
    private int c = 300;
    public int getc()
    {
        return c;
    }
}
public class PPPInheritance
{
    public static void main(String[] args)
    {
        Public obj  = new Public();
        System.out.println("Public Variable is : "+obj.a);
        System.out.println("Protected Variable is : "+obj.b);
        // System.out.println("Private Variable is : "+obj.c);
        System.out.println("Private Variable is : "+obj.getc());
    }
}
