package revesion;

class A {
    final void run()
    {
        System.out.println("running");
    }
}

public class Final extends A {
//    pubic void run()
//    {
//        System.out.println("running at 140");
//    }
    public static void main(String[] args)
    {
        Final f = new Final();
        f.run();
    }

}

// compile time error as (run id final it cant be change )
