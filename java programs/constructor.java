package revision;

public class constructor {
    int c;
    String d;
    int f;
    static String name="apple";



    constructor(int a,String b) {
        c = a;
        d = b;
    }

    constructor(int a,String b, int e) {
        this.c = a;
        this.d = b;
        this.f = e;
    }

    void display(){
        System.out.println("name"+name+" b"+c+" d"+d+" f" +f);
    }

    public static void main(String[] args){
        constructor co= new constructor(10, "100");
        constructor co1= new constructor(10, "100", 1000);

        co.display();
        co1.display();


    }
}
