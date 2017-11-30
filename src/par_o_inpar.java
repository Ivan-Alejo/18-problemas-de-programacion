public class par_o_inpar {
    public static void main(String[] args) {
        par_o_inpar x= new par_o_inpar();
        x.determinar(30);

    }
    public int determinar(int n ){
        if(n%2==0){
            System.out.println(n+" es par");
        }else{
            System.out.println(n+" es impar");
        }

        return n;
    }
}
