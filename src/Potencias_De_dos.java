import java.util.Scanner;
public class Potencias_De_dos {
    public static void main(String[] args) {
        long p;
        Scanner obj = new Scanner(System.in);
        System.out.println("ingrese el final de la potencia");
        p = obj.nextInt();


        long s=2,r;
        for (long i = 0; i <= p; i++) {
            r = (long) Math.pow(s, i);
            System.out.println(r + " ");
        }


    }
}

