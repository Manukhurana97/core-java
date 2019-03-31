// properties object contains key and value pair both as a strin
// It can be used to get property value based on the property key.

package collection;
import java.util.*;
import java.io.*;

public class propertyclass {
    public static void main(String[] args)throws Exception{
        Properties p=System.getProperties();
        Set set=p.entrySet();

        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }


        p.setProperty("name","Sonoo Jaiswal");
        p.setProperty("email","sonoojaiswal@javatpoint.com");

        p.store(new FileWriter("info.properties"),"Javatpoint Properties Example");
    }
}
