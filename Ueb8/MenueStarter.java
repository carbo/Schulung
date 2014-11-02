package Ueb8;

import Prog1Tools.IOTools;
import Ueb1.Malprogramm;
import Ueb2.Berechnung;

public class MenueStarter {

  public static void main (String[] args) {

    int auswahl;

    System.out.println( "Zur Auswahl stehen folgende Programme:" );
    System.out.println( "1 ... Malprogramm"   );
    System.out.println( "2 ... Berechnung"  );

    auswahl = IOTools.readInteger( "Ihre Wahl > " );

    switch ( auswahl ) {

      case 1:
        Malprogramm.main( new String[]{} );
      break;

      case 2:
        Berechnung.main( args );
      break;

      default: System.out.println( "Unzulaessige Wahl!" );
    }

  }

}
