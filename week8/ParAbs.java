abstract class Shape
{
    abstract float area();
    void display()
    {
        System.out.println("This is a shape");
    }
}
class Rectangle extends Shape
{
    float x,y;
    Rectangle(float base,float height)
    {
        x = base;
        y = height;
    }
        public float area()
        {
            return x*y;
        }
}
class Triangle extends Shape
{
    float x,y;
    Triangle(float base,float height)
    {
        x = base;
        y = height;
    }
    public float area()
    {
        return (float)0.50*x*y;
    }
}
public class PartialAbstraction
{
    public static void main(String[] args)
    {
        Rectangle obj1 = new Rectangle(5,10);
        Triangle obj2 = new Triangle(46,30);
        System.out.println("Area of the Rectangle is : "+obj1.area());
        System.out.println("Area of the Triangle is : "+obj2.area());
    }
}
