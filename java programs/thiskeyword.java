package revesion;

public class thiskeyword {
    int roll;
    String name,lang;
    int fees;

     thiskeyword(int roll,String name ,String lang){
        this.name=name;
        this.roll=roll;
         this.lang=lang;

    }
    thiskeyword(int roll,String name ,int fees , String lang){
         this(roll,name,lang);
        this.fees= fees;
    }

    void display(){
         System.out.println(name+roll+fees+lang);
     }


    public static void  main(String[] args){
        thiskeyword t=new thiskeyword(101,"manu",100000,"java");
        thiskeyword t1=new thiskeyword(101,"manu","java");

        t.display();
        t1.display();


    }
}
