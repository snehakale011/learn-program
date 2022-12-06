import java.util.*;

class shape
{
    public void display()
    {
        System.out.println("Inside shape class");
    }
}

class Rectangle extends shape
{
    public void area()
    {
        System.out.println("Inside rectangle class ");

    }
} 

class Ex4
{
    public static void main(String a[])
    {
        Rectangle rect=new Rectangle();

        rect.display();
        rect.area();
    }
}