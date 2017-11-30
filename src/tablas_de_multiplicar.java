import java.util.Scanner;
public class tablas_de_multiplicar {
    public static void main(String[] args)
    {
        Scanner obtenerNumero = new Scanner(System.in);
        int n;

        System.out.println("escribe la tabla que deseas ");
        n = obtenerNumero.nextInt();

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }
}
