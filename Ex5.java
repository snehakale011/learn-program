import java .util.*;

class Shape
{
    public void display()
    {
        System.out.println("Inside Display ");
    }
}

class Rectangle extends Shape
{
    public void area()
    {
        System.out.println("Inside area");
    }
}

class Cube extends Rectangle
{
    public void Volume()
    {
        System.out.println("Inside Volume");
    }
}

class Ex5
{
    public static void main(String a[])
    {
        Cube c=new Cube();

        c.display();
        c.area();
        c.Volume();
        

    }
}
