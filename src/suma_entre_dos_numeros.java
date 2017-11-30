import java.util.Scanner;
public class suma_entre_dos_numeros {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int n1,n2=0;
        int suma=0;
        System.out.println("ingrese el primer valor");
        n1 =obj.nextInt();
        System.out.println("ingrese el segundo valor");
        n2 =obj.nextInt();


        for (int i=n1+1; i<n2; i++){
            suma+=i;
        }
        System.out.println("la suma de los numeros entre "+n1+" y "+n2+" es: "+suma);
    }
}
