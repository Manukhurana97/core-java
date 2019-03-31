// It is a linear collection that supports element insertion and removal at both ends

package collection;
import java.util.*;

public class D_q {
    public static void main(String[] args){
        Deque<String> dq = new ArrayDeque<String>(); {
            dq.add("A");
            dq.add("B");
            dq.add("C");
            dq.add("D");
            dq.offer("E");
            for(String str:dq){
                System.out.println(str);
            }
            System.out.println("Remove First element "+dq.pollFirst());
            System.out.println("Remove Last element "+dq.pollLast());
            System.out.println(dq);
        }
    }
}

