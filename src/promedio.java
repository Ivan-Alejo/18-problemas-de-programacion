import java.util.Scanner;
public class promedio {
    public static void main(String[] args) {

        int p, p1, p2, p3 = 0;
        Scanner obj = new Scanner(System.in);

        System.out.println("ingrese calificacion");
        p = obj.nextInt();

        System.out.println("ingrese calificacion");
        p1 = obj.nextInt();

        System.out.println("ingrese calificacion");
        p2 = obj.nextInt();

        System.out.println("ingrese calificacion");
        p3 = obj.nextInt();


        double promedio = (p + p1 + p2 + p3) / 4;
        System.out.println(promedio);
    }
}