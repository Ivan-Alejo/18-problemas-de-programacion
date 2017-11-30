
public class año_bisiesto {
    public static void main(String[] args) {

     año_bisiesto x= new año_bisiesto();
     x.anoBI(1952);
    }

     public int anoBI(int a ){
        if ((a%4==0 && a % 100 !=0) || a % 400==0){
            System.out.println(a+" es un año bosiesto");

        }else{
            System.out.println(a+" no es un año bisiesto");
        }
        return a;
     }
}

