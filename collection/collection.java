//static methods that operate on or return collections
package collection;
import java.util.*;

public class collection {
    public static void main(String[] args){
    List<String> l= new ArrayList<>();
    l.add("A");
    l.add("B");
    l.add("C");

    System.out.print("List "+l);

    Collections.addAll(l, "D","E");
    System.out.println();
    System.out.println("New List "+l);

    String[] strArr = {"F", "G"};
    Collections.addAll(l, strArr);
    System.out.println("New List"+l);

    List<Integer> l1 = new LinkedList<>();
    l1.add(7);
    l1.add(2);
    l1.add(5);
    l1.add(1);
    l1.add(6);
    l1.add(9);

//  max value
    System.out.println("max value "+Collections.max(l)+" "+Collections.max(l1));
    System.out.println("min value "+Collections.min(l)+" "+Collections.min(l1));

    Collections.sort(l1);
    System.out.println("After sort "+l1);

    Collections.sort(l1, Collections.reverseOrder());
    System.out.println("Reverse sort "+l1);

    l1.add(Integer.valueOf(200));
    System.out.print(l1);

    }
}
