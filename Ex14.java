import java.util.*;

class Student implements Cloneable
{
    public String name;
    public int rollno;
    public float marks;

     public Student(String str,int rno,float value)
     {
        this.name=str;
        this.rollno=rno;
        this.marks=value;
     }

     public Object clone() throws  CloneNotSupportedException
     {
        return super.clone();
     }
}

class Ex14
{
    public static void main(String a[])
    {
        try
        {
            Student sobj1=new Student("Sneha",20,98);
            Student sobj2=(Student)sobj1.clone();

            System.out.println("Enter the name of student :"+sobj1.name);

            System.out.println("Enter the rollno of student :"+sobj1.rollno);

            System.out.println("Enter the name of student :"+sobj1.marks);

            sobj2.name="Uddhav";
            System.out.println("Enter the name of student :"+sobj1.name);
            System.out.println("Enter the name of student :"+sobj2.name);

        }
        catch(CloneNotSupportedException e)
        {}
    }
}
