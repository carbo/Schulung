package Ueb17;

import java.util.Arrays;
import java.util.Comparator;

public enum Zielflughafen {
	NEW_YORK(8.5f), HAMBURG(1f), RIO_DE_JANEIRO(10.5f), MOSKAU(7f);
	
	float dauer = 0;
	
	Zielflughafen(float dauer) {
		this.dauer = dauer;
		
	}
	
	public float dauerDesFlugesVonFrankfurt() {
		return dauer;
	}
	
	public static void listeDerFlugdauer() {
		Zielflughafen[] zielflughafen = Zielflughafen.values();
		Arrays.sort(zielflughafen, new MyFlughafenComparator());
		for(Zielflughafen ziel : zielflughafen) {
			System.out.println(ziel.name());
		}
	}
	
	static class MyFlughafenComparator implements Comparator<Zielflughafen>
	{
	    @Override
		public int compare(Zielflughafen o1, Zielflughafen o2)
	    {
	    	return (int)(o2.dauer - o1.dauer); // this compares length
	    }
	}

}
