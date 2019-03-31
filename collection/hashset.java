// It  is used to create a collection that uses a hash table for storage.

package collection;
import java.util.*;


public class hashset {
    public static void main(String[] args) {
//        arraylist
        LinkedList<String> ar = new LinkedList<String>();
        ar.add("A");
        ar.add("B");
        System.out.println(ar);


//            hashset
        HashSet<String> hs = new HashSet<String>(ar);
        hs.add("C");
        hs.add("D");
        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

    }
}