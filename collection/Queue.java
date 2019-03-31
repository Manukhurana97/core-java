// In this the element in FIFO(First In First Out).

package collection;
import jdk.nashorn.internal.ir.WhileNode;

import java.util.*;

public class Queue {
    public static void main(String[] args){
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("A");
        pq.add("B");
        pq.add("C");
        pq.add("D");
//        print first element of list
        System.out.println("head "+pq.peek());

        Iterator itr = pq.iterator();
        {
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
//        remove first element
        System.out.println("Remove element"+pq.poll());
        System.out.println(pq);

    }
}
