package revision;

class Eating{
    String food;

    Eating(String food)
    {
        this.food=food;
    }

    void eat()
    {
        System.out.println("Eating "+food);
    }
}


public class superKeyword extends Eating {

    String desert;
    superKeyword(String desert,String food)
    {
        super(food);
        this.desert=desert;
    }

    void sweet()
    {
        System.out.println("Eating "+food+desert);
    }

    public static void main(String[] args)
    {
        superKeyword s = new superKeyword("icecream","curryRice");
        s.eat();
        s.sweet();
    }


}
