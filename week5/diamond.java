class A
{
    public void a()
    {
        System.out.println("I'm class in A");
    }
}
class B extends A
{
    public void b()
    {
        System.out.println("I'm class in B");
    }
}
class C extends A
{
    public void c()
    {
        System.out.println("I'm class in C");
    }
}

//Java doesn't support Multiple Inheritance

public class Diamond
{
    public static void main(String[] args)
    {
        B b = new B();
        b.a();
        b.b();
        C c = new C();
        c.a();
        c.c();
    }
}
