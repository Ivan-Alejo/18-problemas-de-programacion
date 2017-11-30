public class centimetros_pulgadas {
    public static void main(String[] args) {
        centimetros_pulgadas x = new centimetros_pulgadas();
        x.convertir(100);
    }
    public int convertir(int c){
        double convertir=c/2.54;
        System.out.println(c+"cm son "+convertir+"in");
        return c;
    }
}
