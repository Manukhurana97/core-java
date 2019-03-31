// Its provide the effecient way of storing the eement in sorted order
package collection;
import java.util.*;

public class Tree_Map {
    public static void main(String[] args){
        TreeMap<Integer,String> tm = new TreeMap<Integer, String>();
        tm.put(100,"A");
        tm.put(101,"B");
        tm.put(102,"C");
        tm.put(103,"D");

        for(Map.Entry m:tm.entrySet()){
            System.out.println(m.hashCode());
        }
        tm.remove(102);
        for(Map.Entry m:tm.entrySet()){
            System.out.println(m.getKey()+":-"+m.getValue());
        }

        System.out.println("descending order :"+ tm.descendingMap());
        System.out.println("Head :"+ tm.headMap(102));
        System.out.println("tail :"+ tm.tailMap(102));

    }
}
