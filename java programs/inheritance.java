package revesion;

class info{

    void display(String city,String state,String country){
       System.out.println(city+state+country);


    }
}

public class inheritance extends info {


    public void display(String name,String id){
        System.out.println(name+id);
    }

    public static void main(String[] args)
    {

        inheritance a = new inheritance();
        a.display("Manu","khurana");
        a.display("Faridabad","haryana","India");

    }
}
