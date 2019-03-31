//specialized Set implementation for use with enum types
package collection;
import java.util.*;

enum days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Enum {
    public static void main(String[] srgs){

        Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
        Iterator<days> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Set<days> set1 = EnumSet.allOf(days.class);
        System.out.println(set1);

    }
}
