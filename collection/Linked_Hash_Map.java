// It is a Hashtable and Linked list implementation of the Map interface.

package collection;
import java.util.*;

public class Linked_Hash_Map {
    public static void main(String [] args){
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();{
            lhm.put(100,"A");
            lhm.put(101,"B");
            lhm.put(102,"C");
            lhm.put(103,"D");
            lhm.put(104,"e");
            for(Map.Entry m : lhm.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
            lhm.remove(102);
            System.out.println(lhm.entrySet());
        }
    }
}
