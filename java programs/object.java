package revesion;

public class object {
    String name;
    int id;

    public void insert(int i, String a){
        name=a;
        id=i;
    }

    void display(){
        System.out.println(name+"  "+id);
    }


    public static void main(String args[]){

        object o =new object();
        o.insert(1212122,"manu");
        o.display();





    }

}
