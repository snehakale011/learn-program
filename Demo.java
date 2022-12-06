//class Defination
class Maths
{
      public int iNo1;         //Characteristics
      public int iNo2;         //Characteristics

      public Maths()          // Default Constructor
      {
           System.out.println("Inside default constructor");
           iNo1=0;
           iNo2=0;  
      }
      public Maths(int a,int b)        // Parametrised Constructor
      {
        System.out.println("Inside Parametrised constructor");
        iNo1=a;
        iNo2=b;  
    }
      public int Addition()              // Behaviour
      {
        int iAns=0;
        iAns=iNo1+iNo2;
        return iAns;
      }
      public int Substraction()         // Behaviour
      {
        int iAns=0;
        iAns=iNo1-iNo2;
        return iAns;
      }
}   // End of maths class

class Demo
{
      public static void main(String arr[])
      {
        System.out.println("Inside main function");
        Maths mobj1=new Maths();
        Maths mobj2=new Maths(10,11);

        int iRet=0;
        iRet=mobj1.Addition();
        System.out.println("Addition is :"+iRet);

        iRet=mobj2.Addition();
        System.out.println("Addition is :"+iRet);
      }
}
