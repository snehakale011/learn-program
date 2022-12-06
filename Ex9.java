import java.util.*;

interface Base
{
    public void display();
    public void move();

}

class Derived implements Base
{
    public void display()
    {
        System.out.println("implemetion display");
    }

    public void move()
    {
        System.out.println("implementation move");
    }
}

class Ex9
{
    public static void main(String tr[])
    {
        Base obj=new Derived();

        obj.display();
        obj.move();
    }
}