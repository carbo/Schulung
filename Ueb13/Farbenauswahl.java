package Ueb13;

public class Farbenauswahl implements Farben {
	private static final String[] farbe = new String[7];
	
	static {
		farbe[Farben.BLAU] = "blau";
		farbe[ROT] = "rot";
		farbe[Farben.WEISS] = "weiss";
		farbe[Farben.ROSA] = "rosa";
		farbe[Farben.SCHWARZ] = "schwarz";
		farbe[BRAUN] = "braun";
		
	}

	@Override
	public void defFarben(int i) {
		System.out.println("Die ausgewaehlte Farbe ist: "+ farbe[i]);
		
	}

}