import java.util.*;

class Animal
{
    public void move()
    {
        System.out.println("animal can move");
    }
}

class Dog extends Animal
{
    public void move()
    {
        super.move();
        System.out.println("Dogs can walk and run");
    }
}

class Ex7
{
    public static void main(String arr[])
    {
        Animal a=new Dog();
        a.move();


    }
}
