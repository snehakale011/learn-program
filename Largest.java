import java.util.*;

class Largest
{
    public static void main(String a[])
    {
        int x;
        int y;
        int z;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the 1st no");
        x=sobj.nextInt();
  
         System.out.println("Enter the 2nd no");
         y=sobj.nextInt();

         System.out.println("Enter the 3rd no");
         z=sobj.nextInt();

         if(x>y && x>z)
         {
            System.out.println("largest no is"+x);

         }

         else if(y>z)
         {
            System.out.println("largest no is"+y);
         }

         else
         {
            System.out.println("largest no is "+z);
         }
         


    }
}