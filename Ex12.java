import java.util.*;

class Arithematic
{
      public int Division(int a,int b) throws ArithmeticException
      {
        int ans=0;
         ans=a+b;
          return ans;
      }
}

class Ex12
{

    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the first no");
        int ino1=sobj.nextInt();

        System.out.println("Enter the second no");
        int ino2=sobj.nextInt();

        Arithematic aobj=new Arithematic();

        try
        {
            int ret=aobj.Division(ino1,ino2);
            System.out.println("Division is"+ret);

        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception occured");
            System.out.println(e);
        }
    }
}