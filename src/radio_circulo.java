public class radio_circulo {
    public static void main(String[] args) {
        radio_circulo x=new radio_circulo();
        x.Calcular(8 );
    }
    public int Calcular(int r) {
       double pi=3.1416;
       double area= pi*Math.pow(r,2);
       double perimetro= 2*pi*r;
        System.out.println("el harea es: "+area);
        System.out.println("el perimetro es: "+perimetro);
        return r;
    }
}
