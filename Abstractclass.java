//Code By TGSAYAN
import java.util.*; 
import java.text.DecimalFormat;
public class Abstractclass
{
    public static void main(String[] args)
    {
        int l, ll, bb, r, a;
        Scanner input = new Scanner(System.in);
        l = input.nextInt();
        ll = input.nextInt();
        bb = input.nextInt();
        r = input.nextInt();
        a = input.nextInt();
        
        Square obj2 = new Square();
        obj2.Area(l);
        
        Rectangle obj = new Rectangle();
        obj.Area(ll, bb);
        
        Triangle obj3 = new Triangle();
        obj3.Area(l, ll);
        
        Circle obj1 = new Circle();
        obj1.Area(r);
        
        
        
        
        
    }
}
class Square 
{
    void Area(int side)
    {
        System.out.println("Area of Square : "+ side * side);
    }
    void Area(float side)
    {
        System.out.println("Area of Square : "+ side * side);
    }
}
class Circle 
{
    static final double PI = Math.PI;
  
    void Area(double r)
    {
        double A = PI * r * r;
        DecimalFormat df = new DecimalFormat("###.#");
        System.out.println("Area of Circle : " + df.format(A));
    }
  
    void Area(float r)
    {
        double A = PI * r * r;
        DecimalFormat df = new DecimalFormat("###.#");
        System.out.println("Area of Circle : " + df.format(A));
    }
}
class Rectangle 
{
    void Area(double l, double b)
    {
        System.out.println("Area of Rectangle : " + l * b);
    }
    void Area(int l, int b)
    {
        System.out.println("Area of Rectangle : " + l * b);
    }
}

class Triangle 
{
    void Area(double l, double b)
    {
        System.out.println("Area of Triangle : " + (l*b)/2);
    }
    void Area(int l, int b)
    {
        System.out.println("Area of Triangle : " + (l*b)/2);
    }
}