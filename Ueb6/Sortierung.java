package Ueb6;

import Prog1Tools.IOTools;

public class Sortierung {

  public static void main (String[] args) {

    int count;
    int[] zahl;

    // Eingabe
    count = IOTools.readInteger( "Wie viele Zahlen willst Du sortieren? ");

    zahl = new int[count];

    for (int i = 0; i < zahl.length; i++)
        zahl[i] = IOTools.readInteger( (i+1) + ". Zahl: " );


    java.util.Arrays.sort( zahl ); // wegen der import-Anweisung brauchen wir keinen Vollqualifizierten Namen

    // Ausgabe
    for (int i = 0; i < zahl.length; i++)
      System.out.print( zahl[i] + " " );

    System.out.println();

  }

}
