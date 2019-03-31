// Arraylist uses a dynamic array for storing the elements


package collection;//Array in java.collection
import java.util.*;
public class arraylist {
    public static void main(String[] args){
//      Create Array list
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("A");
        ar.add("c");


        for (String obj:ar)
            System.out.println(obj);


        ArrayList<String> ar1=new ArrayList<String>();
        ar1.add("B");
        ar.addAll(1,ar1);


        Iterator itr=ar.iterator();
        System.out.println("After adding");
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

//       Remove element
        ar.removeAll(ar1);
        System.out.println("After remove "+ar);

//      check for empty list
        System.out.println(ar.isEmpty());

//      Clear list
        ar.clear();
        System.out.println("After clear"+ar);
    }
}




