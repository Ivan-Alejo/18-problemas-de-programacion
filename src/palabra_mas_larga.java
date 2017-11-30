import java.util.*;
public class palabra_mas_larga {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String p1, p2;
        int n1, n2;
        p2 = "";




            System.out.println("escribe la palabra 1");
            p1 = tec.nextLine();
            n1 = p1.length();

            n2= p2.length();

            if(n2<n1){
                p2 = p1;
            }

        System.out.println("escribe la palabra 2");
        p1 = tec.nextLine();
        n1 = p1.length();

        n2= p2.length();

        if(n2<n1){
            p2 = p1;
        }
int p=0;
        if (n1>=n2){ p=n1;}
        else { p=n2;}

        System.out.println("la palabra mas larga es " + p2+" con "+p+" letras");


    }

}


