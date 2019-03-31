package revesion;

public class if_else {
    public static void main(String[] args){
        int a=10;
        if(a%2==0) {
            System.out.println("Even ");
        }
         else{
             System.out.println("odd");
         }

//         nested if
         int age=20, weight=50;
         if(age>=18){
             if(weight>=40){
                 System.out.println("elegible to donate");
             }
             else {
                 System.out.println("Not elegible to donate");
             }
         }

    }

}
