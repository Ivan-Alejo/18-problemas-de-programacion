import java.util.Scanner;
public class hora {
    public static void main(String[] args) {
        int horaactual=0;
        int numero=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("ingrese la hora actual");
        horaactual =obj.nextInt();
        System.out.println("ingrese el numero de horas enteras");
       numero =obj.nextInt();

       int horachida=horaactual + numero;
        System.out.println("la hora actua es: "+horaactual);
        System.out.println("la hora dentro de "+numero+"hrs es: "+horachida);
    }
}
