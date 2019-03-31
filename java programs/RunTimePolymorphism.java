package revesion;

import java.text.RuleBasedCollator;

class vehicle {
    void run(int speed)
    {
        System.out.println("Bike running at " + speed + "km/h");
    }
}

public class RunTimePolymorphism extends vehicle
{
    void run(int speed)
    {
        System.out.println("running at " + speed + "km/h");
    }

    public static void main(String[] args)
    {
       vehicle v = new RunTimePolymorphism();
       v.run(100);

    }
}
