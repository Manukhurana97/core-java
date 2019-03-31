//LinkedList uses a doubly linked list to store the elements

package collection;
import java.util.*;

public class linkedlist {
    public static void main(String[] args){
//         linkedlist in collection
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");

        Iterator<String> itr=ll.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        LinkedList<String> ll1=new LinkedList<>();
        ll1.add("e");
        ll1.add("f");
        ll.addAll(ll1);
        System.out.println(ll);

//        remove element from list
        ll.remove(2);
        for(String obj:ll)
            System.out.println(obj);

//        reverse a list

        Iterator itr1 =ll.descendingIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());

        }
        System.out.println("Second element in list "+ll.get(2));
    }
}