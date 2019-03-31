//A map contains values on the basis of key, i.e. key and value pair
//Each key and value pair is known as an entry

package collection;
import java.util.*;

public class MapInterface1 {
    public static void main(String[] args){
        Map<Integer,String> m= new HashMap<Integer,String>();
        {
            m.put(101,"A ");
            m.put(102,"B ");
            m.put(103,"C ");
            m.put(104,"D ");
            m.put(105,"E ");
            m.put(106,"F ");
            for(Map.Entry map:m.entrySet()) {
                System.out.println(map.getKey() +" " + map.getValue());
            }

            System.out.println(m.entrySet());

//            System.out.println(.stream());

        }
    }
}
