import java.util.*;

class MyException extends Exception
{
    String s1;

    MyException(String s2)
    {
           s1=s2;
    }
    public String toString() 
    { 
        return ("Output String = "+s1);
    }
} 


class Ex11
{
    public static void main(String s[])
    {
        try
          {
            System.out.println("try block");
            throw new MyException("message for you"); 
          }
          catch(MyException e)
          {
            System.out.println("catch block");
            System.out.println(e);
          }
    }
}