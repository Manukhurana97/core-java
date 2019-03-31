//implements a hashtable, which maps keys to values

package collection;
import java.util.*;

public class Hash_table {
    public static void main(String[] args){
        Hashtable<Integer,String> ht =new Hashtable<Integer,String>();
        ht.put(100,"A");
        ht.put(101,"B");
        ht.put(102,"C");
        ht.put(103,"D");

        for(Map.Entry m:ht.entrySet()){
            System.out.println(m);
        }
        System.out.println(ht.remove(+ 101));

        ht.putIfAbsent(105,"C");
        System.out.println("Updated map :"+ht);

    }
}
