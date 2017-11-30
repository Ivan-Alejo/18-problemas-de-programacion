import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {

        double altura,edad,peso = 0;
        Scanner obj = new Scanner(System.in);

        System.out.println("ingresa tu altura en metros ");
        altura = obj.nextDouble();
        System.out.println("ingresa tu edad ");
        edad = obj.nextDouble();
        System.out.println("ingresa tu peso en kilogramos ");
        peso = obj.nextDouble();

        double imc=peso/(altura*altura);

        System.out.println();

        if(imc<22.0 && edad<45){
            System.out.println("el riesgo de sufra una enfermedad coronaria es bajo ");
        }
        if(imc>22.0 && edad<45){
            System.out.println("el riesgo de sufra una enfermedad coronaria es medio ");
        }
        if(imc<22.0 && edad>45){
            System.out.println("el riesgo de sufra una enfermedad coronaria es medio ");
        }
        if(imc>22.0 && edad>45){
            System.out.println("el riesgo de sufra una enfermedad coronaria es alto ");
        }
    }
}