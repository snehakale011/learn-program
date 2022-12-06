import java.util.*;

class Ex3
{
    static
    {
        System.out.println("Inside static block of static demo class with contains main");
    }

    public Ex3()
   {
        System.out.println("Inside constructor of static ex3");
   }

   public static void main(String a[])
   {
            System.out.println("Inside main function");
            System.out.println("Value of static No3:"+Demo.no3);
            System.out.println("Value of static No4:"+Demo.no4);
            Demo.gun();

            Demo obj1=new Demo();
            
            obj1.fun();


   }
   
}

class Demo
{
    public int no1;
    public int no2;
    public static int no3;
    public static int no4;

    static
    {
        System.out.println("inside block of demo class");
        no3=1;
        no4=2;
    }

    public Demo()
    {
        System.out.println("Inside Constuctor");
        no3=11;
        no4=21; 
    }
    public void fun()           //Non static method
{
    System.out.println("Inside non static method fun");
    
    System.out.println("Value of No1"+this.no1);
    
    System.out.println("Value of No2"+this.no2);
    
    System.out.println("Value of No3"+this.no3);
    
    System.out.println("Value of No4"+this.no4);

}
public static void gun()           // static method
{
    System.out.println("Inside non static method gun");

    //System.out.println("Value of No1"+no1);
    
    //System.out.println("Value of No2"+no2);
    
    System.out.println("Value of No3"+no3);
    
    System.out.println("Value of No4"+no4);
}
}