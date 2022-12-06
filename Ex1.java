import java.util.*;

class Ex1
{
    public static void main(String a[])
    {
        int i;
        int isize;
        int n=5;

        for(i=0;i<=n;i++)
        {
            System.out.println("Display the op:"+i);
        }
     
        i=0;
        while(i<=n)
        {
            System.out.println("Display the op for while :"+i);
            i++;
        }

       i=0;
       do
       {
        System.out.println("Display the op for do while :"+i);
        i++;  
       }while(i<=n);

       int arr[]={12,13,14,15}; 

       for(int iNo:arr)
       {
        System.out.println(iNo);
       }



         




    }
}

