import java.util.*;

class Shape
{
    public void display()
    {
    System.out.println("inside shape");
    }
}

class Rectangle extends Shape
{
    public void area()
    {
        System.out.println("Inside rectangle");
    }
} 

class Cube extends Shape
{
    public void volume()
    {
        System.out.println("Inside cube");
    }
}

class Ex6
{
    public static void main(String a[])
    {
        Rectangle r=new Rectangle();
        Cube c=new Cube();
        
       r.display();
        
       c.display();
    }
}