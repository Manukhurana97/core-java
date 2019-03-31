package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

//public class linkedhashset {
//    public static void main(String args[]){
//        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
//        lhs.add("a");
//
//        System.out.println(lhs);
//
//    }
//
//}


class book{
    int id;
    String name,author,publisher;
    int quatity;
    public book(int id,String name,String author, String publisher, int quatity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher = publisher;
        this.quatity = quatity;
    }

}

public class linkedhashset {
    public static void main(String[] args){
        LinkedHashSet<book> lhs = new LinkedHashSet<>();
        book b1=new book(101,"let us c","Yashant Kanetkat","BPB",8);
        book b2=new book(103,"Operating System","Galvin","Wiley",6);

        lhs.add(b1);
        lhs.add(b2);

        for(book b:lhs){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quatity);
        }

    }
}