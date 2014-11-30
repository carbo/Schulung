package UebEnum;

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
		System.out.println("Order by Enum");
		print(zielflughafen);
		Arrays.sort(zielflughafen, new MyFlughafenComparator());
		System.out.println("Order by Comparator");
		print(zielflughafen);
	}
	
	private static void print(Zielflughafen[] zielflughafen) {
		System.out.println("--------------------");
		for(Zielflughafen ziel : zielflughafen) {
			System.out.println(ziel.dauer);
			System.out.println(ziel.name());
		}
		System.out.println("--------------------");
	}
	
	static class MyFlughafenComparator implements Comparator<Zielflughafen>
	{
	    public int compare(Zielflughafen o1, Zielflughafen o2)
	    {
	    	return (int)(o1.dauer - o2.dauer); // this compares length
	    }
	}

}
