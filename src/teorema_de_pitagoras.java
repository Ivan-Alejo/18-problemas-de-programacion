public class teorema_de_pitagoras {
    public static void main(String[] args) {
     teorema_de_pitagoras x= new teorema_de_pitagoras();
     x.pitagoras(10,5);
    }
        public double pitagoras(int a, int b){
        double c;
            c=Math.sqrt((a*a+b*b));
            System.out.println(c);
            return c;

        }


    }

