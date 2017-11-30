import java.util.Scanner;
public class division_exacta {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
int d1,d2=0;
int b=0;
        System.out.println("ingrese un el dividendo");
        d1 = obj.nextInt();

        System.out.println("ingrese el divisor");
        d2 = obj.nextInt();

        if(d1%d2==0){
            System.out.println(d1+"/"+d2+" es division exacta");
        }else{
            System.out.println(d1+"/"+d2+" no es division exacta");
        }

    }
}
