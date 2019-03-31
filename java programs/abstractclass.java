package revision;

abstract class Bike {
    Bike()
    {
        System.out.println("Default constructor Abstract");
    }

    abstract void run();

    void color() {
        System.out.println("Red");
    }
}

class car extends Bike{
    void run()
    {
        System.out.println("Driving bike");
    }
}


public class abstractclass extends Bike{
    void run()
    {
        System.out.println("running safely");
    }
    public static void main(String[] args){
        Bike b = new abstractclass();
        Bike c = new car();

        b.run();
        c.run();
        b.color();

    }
}
