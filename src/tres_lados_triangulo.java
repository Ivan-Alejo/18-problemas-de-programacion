import java.util.Scanner;

public class tres_lados_triangulo {


    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        double l1,l2,l3;
        System.out.println("Introduzca el primer Lado:");
        l1 = lector.nextDouble();
        System.out.println("Introduzca el sundo Lado:");
        l2 = lector.nextDouble();
        System.out.println("Introduzca el tercer Lado:");
        l3 = lector.nextDouble();
        if (l1==l2 && l2==l3)
            System.out.println("\nEl Triangulo es Equilatero\n");
        else
        {
            if (l1==l2 || l1==l3 || l2==l3)
                System.out.println("\nEl Triangulo es Isoceles");
            else
            {
                if (l1!=l2 || l1!=l3 || l3!=l2){

                    System.out.println("\nEl Triangulo es Escaleno");

                }else {System.out.println("\n es un triangulo invalido");}

            }
        }
    }
}
