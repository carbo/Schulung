package Ueb16;
public class ExceptionUebung {

        public static double gibZufallsZahlBisEinhalb() throws Exception {

                double res = Math.random();

                if(res > 0.5)

                        throw new Exception("Zahl zu gross");

                return res;

        }




        public static void main(String[] args) {
				double zahl;
                try {

                        zahl = gibZufallsZahlBisEinhalb();

                } catch(Exception e) {

                        zahl = 0.5;

                }

                System.out.println(zahl);

        }




}