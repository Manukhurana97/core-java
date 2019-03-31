package revesion;

// has-a relation

class Address{
    String city,state,country;
    public Address(String city,String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;

    }

    void  display1(){
        System.out.println();
        System.out.println("Parent class");
        System.out.println("city "+city);
        System.out.println("state "+state);
        System.out.println("Country "+country);


   }
}


public class aggregation {
    int ID ;
    String Name;
    Address Add;

    public aggregation(int id, String name,Address add){
        this.ID=id;
        this.Name=name;
        this.Add=add;
    }
     void display(){
         System.out.println("Child class ");
        System.out.println("Name "+Name);
        System.out.println("Id "+ID);
        System.out.println("city "+Add.city);
        System.out.println("State "+Add.state);
        System.out.println("Country "+Add.country);
     }

     public static void main(String[] args){
        Address address = new Address("faridabad","haryana","India");
        aggregation a = new aggregation(10101,"Manu" , address);
        a.display();
     }

}
