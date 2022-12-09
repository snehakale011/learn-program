import java.util.*;
//import java.util.Scanner;

class Input
{
    public static void main(String arg[])
    {
          Scanner sobj=new Scanner(System.in);
          int iNo1=0,iNo2=0;
          int iAns=0;

          System.out.println("Enter the First no:");
          iNo1=sobj.nextInt();

          System.out.println("Enter the second no:");
          iNo2=sobj.nextInt();

          iAns=iNo1+iNo2;

          System.out.println("Addition is:"+iAns);
    }
}



/*
Methods of scanner class

 boolean       nextBool()
 byte
 char            nextLine()
 int 
 float
 double
 short
 long
 */