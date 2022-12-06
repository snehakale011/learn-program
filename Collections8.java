import java.util.*;

class Collections8
{
    public static void main(string arg[])
    {
        Hashtable <String ,Integer>hobj=new Hashtable<String ,Integer>();
        
        hobj.put("PPA",18000);
        hobj.put("LB",17000);
        hobj.put("Paython",16500);
        hobj.put("LSP",21000);

        System.out.println(hobj.get("Python"));
        Enumeration eobj=hobj.keys();

        while(eobj.hasMoreElements())
        {
            System.out.println("value is:"+eobj.nextElement());
        }
        hobj.remove("LB");

    }
}