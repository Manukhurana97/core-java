// Implements the map interface by using a hash table
package collection;
import java.util.*;


public class HashMap1 {
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"A");
        hm.put(101,"B");
        hm.put(102,"C");
        hm.put(103,"D");
        hm.put(104,"E");
        hm.put(105,"F");
        hm.put(106,"G");

        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }

        hm.putIfAbsent(102,"C");
        System.out.println("After invoking putIfAbsent() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("After replace");
        System.out.println(hm.replace(101,"B","Z"));
        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }

        hm.remove(101);
        System.out.println(hm);
    }
}
