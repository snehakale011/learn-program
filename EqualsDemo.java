class Demo
{
    public int No1;
    public int No2;

    public Demo(int a,int b)
    {
        No1=a;
        No2=b;
    }
}

class EqualsDemo
{
    public static void main(String s[])
    {
         String s1="hello";
         String s2="hello";

         System.out.println("Hashcode of s1:"+s1.hashCode());
         System.out.println("Hashcode of s2:"+s2.hashCode());
         if(s1.equals(s2))
         {
            System.out.println("Objects are same");
         }
         else
         {
            System.out.println("Objects are different");
         }
         if(s1==s2)
         {
            System.out.println("Objects are same");
          }
        else
         {
            System.out.println("Objects are different");
         }
         

    }
}