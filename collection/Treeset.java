// It uses a tree for storage.

package collection;
import java.util.*;

public class Treeset {
    public static void main(String[] args){
       TreeSet<String > ts = new TreeSet<String>();
       ts.add("A");
       ts.add("B");
       ts.add("C");
       ts.add("D");
       System.out.println("String"+ts);

       TreeSet<Integer> ts1 = new TreeSet<Integer>();
       ts1.add(1);
       ts1.add(2);
       ts1.add(3);
       ts1.add(4);
       ts1.add(5);

//     reverse
       Iterator itr = ts1.descendingIterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
        }

       System.out.println("Highest Value " +ts1.pollFirst());
       System.out.println("Lowest Value "+ts1.pollLast());






    }
}
