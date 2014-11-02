package Ueb4;
public class Sekundenzerlegung {


	public static void main(String [] args) {

		int sec, jahre, tage, stunden, minuten, sekunden;

		sec = 100000000;
		System.out.println( sec + " Sekunden entsprechen:" );

		jahre    = sec / (365*3600*24);
		sec      = sec % (365*3600*24);
		tage     = sec / (3600*24);
		sec      = sec % (3600*24);
		stunden  = sec / 3600;
		sec      = sec % 3600;
		minuten  = sec / 60;
		sec      = sec % 60;
		sekunden = sec;

		System.out.println( jahre    + " Jahren,"     );
		System.out.println( tage     + " Tagen,"      );
		System.out.println( stunden  + " Stunden,"    );
		System.out.println( minuten  + " Minuten und" );
		System.out.println( sekunden + " Sekunden."   );
	}

}
									
