package Ueb5;
import Prog1Tools.IOTools;
public class ZahlenAlsWoerter{

	public static void main(String arg[]) {
		int zahl = IOTools.readInteger("Eingabe ");;
		int rest;
		String ziffer = "";
		while(zahl != 0) {
			rest = zahl % 10;
			zahl = zahl / 10;
			switch (rest) {
				case 1: ziffer = "eins";   break;
				case 2: ziffer = "zwei";   break;
				case 3: ziffer = "drei";   break;
				case 4: ziffer = "vier";   break;
				case 5: ziffer = "fuenf";  break;
				case 6: ziffer = "sechs";  break;
				case 7: ziffer = "sieben"; break;
				case 8: ziffer = "acht";   break;
				case 9: ziffer = "neun";   break;
				case 0: ziffer = "null";   break;
			}
			System.out.println(ziffer);
			
		}
	}
}
