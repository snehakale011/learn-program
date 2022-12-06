import java.util.*;

class Evenodd

{
    public static void main(String a[])
    {
        int n;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sobj.nextInt();

        if(n%2==0)
        {
            System.out.println("The no is even");
        }
        else
        {
            System.out.println("The no is odd");
        }
    }
}