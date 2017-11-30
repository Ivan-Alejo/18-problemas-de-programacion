import java.util.Scanner;
public class letra_o_numero {
    public static void main(String[] args) {

        String L = "";

        Scanner obj = new Scanner(System.in);

        System.out.println("ingrese letra o numero");
       L = obj.next();


        if (comparar(L) == true) { System.out.print(L+ " es numero" ); }
                else {

                    for (int a=0; a<L.length(); a++){
                        if(L.charAt(a)>=32 && L.charAt(a)<=64){System.out.print(L+ " ES SIMBOLO");}
                        else {   for (int i =0; i<L.length(); i++){
                            if(L.charAt(a)>=65 && L.charAt(a)<=90 ){System.out.print(L+ " es letra y Es mayuscula");}
                            else {System.out.print(L+" es letra y es minuscula");} } }} } }



    public static boolean comparar(String str) {
        return (str.matches("[+-]?\\d*(\\.\\d+)?") && str.equals("")==false);

    }
}
