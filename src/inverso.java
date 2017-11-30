import java.util.Scanner;
public class inverso {
    public static void main(String[] args) {

        int n=0;
        Scanner obj = new Scanner(System.in);

        System.out.println("ingresa un numero de tres digitos ");
        n = obj.nextInt();

        int b=0;

        while(n!=0){
            b=n%10;
            n=n/10;
            System.out.print(b);
        }




    }
}
