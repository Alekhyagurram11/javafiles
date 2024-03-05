class A
{
    public void a()
    {
        System.out.println("I'm in class A");
    }
}
class B
{
    public void b()
    {
        System.out.println("I'm in class B");
    }
}

// Simple Inheritance
class C extends A
{
    public void c()
    {
        System.out.println("I'm class C");
    }
}

// Multilevel Inheritance
class D extends A
{
    public void d()
    {
        System.out.println("I'm in class D");
    }
}
class E extends D
{
    public void e()
    {
        System.out.println("I'm class E");
    }
}

// Hierarchical Inheritance
class F extends A
{
    public void f()
    {
        System.out.println("I'm class F");
    }
}
class G extends A
{
    public void g()
    {
        System.out.println("I'm class G");
    }
}

public class InheritanceTypes
{
    public static void main(String[] args)
    {
        // Simple Inheritance
        System.out.println("Simple Inheritance");
        C obj1 = new C();
        obj1.a();
        obj1.c();
        
        // Multilevel Inheritance
        System.out.println("Multilevel Inheritance");
        E obj2 = new E();
        obj2.a();
        obj2.d();
        obj2.e();
        
        // Hierarchical Inheritance
        System.out.println("Hierarchical Inheritance");
        F obj3 = new F();
        obj3.a();
        obj3.f();
        G obj4 = new G();
        obj4.a();
        obj4.g();
    }
}
// Multiple Inheritance
// Java doesn't support Multiple Inheritance
// Hybrid Inheritance
// Java doesn't support Hybrid Inheritance
