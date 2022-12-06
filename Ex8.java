import java.util.*;

abstract class Lang
{
    public void display()
    {
        System.out.println("java programming");
    }
}
class Java extends Lang
{
    public void move()
    {
        System.out.println("lang move");
    }
}

class Ex8
{
    public static void main(String a[])
    {
        Lang obj=new Java();
        Java obj1=new Java();

        obj.display();
        obj1.move();
    }
}
