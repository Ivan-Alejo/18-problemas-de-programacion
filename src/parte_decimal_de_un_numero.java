public class parte_decimal_de_un_numero {

    public static void main(String[] args) {
        parte_decimal_de_un_numero x = new parte_decimal_de_un_numero();
        x.decimal(2.5);
    }

    public double decimal(double n) {


        long e = (long) n;
        double d = n - e;

        System.out.println("parte entera= " + e);
        System.out.println("parte decimal= " + d);
        return n;
    }
}
