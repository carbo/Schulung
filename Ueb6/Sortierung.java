package Ueb6;
public class Sortierung {

  public static void main (String[] args) {

    int count;
    int[] zahl;

    // Eingabe
    count = args.length;

    zahl = new int[count];

    for (int i = 0; i < args.length; i++)
      zahl[i] = Integer.parseInt(args[i]);

    java.util.Arrays.sort( zahl ); // wegen der import-Anweisung brauchen wir keinen Vollqualifizierten Namen

    // Ausgabe
    for (int i = 0; i < zahl.length; i++)
      System.out.print( zahl[i] + " " );

    System.out.println();

  }

}
