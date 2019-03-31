package revision;

public class whileloop {
    public static void main(String[] args){
        int i=1;
        while(i<10){
            System.out.print(" "+i);
            i++;
        }
        System.out.println();




        int j=0;
        do{
            System.out.print(" "+j);
            j++;
        }
        while (j<10);
        System.out.println();




        boolean m=true;
        int n=0;
        do {
            if (n<=10){
                System.out.print(" " + n);
                n++;
            }
            else {
                break;
            }

        }
        while (m);

    }
}
