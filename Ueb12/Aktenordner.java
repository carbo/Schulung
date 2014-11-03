package Ueb12;

public class Aktenordner {
	public Aktenordner(int anzahlBlaetter, String farbe) {
		super();
		this.anzahlBlaetter = anzahlBlaetter;
		this.farbe = farbe;
	}
	private int anzahlBlaetter;
	private String farbe;
	
	
	@Override
	public String toString() {
		return "Aktenordner [anzahlBlaetter=" + anzahlBlaetter + ", farbe="
				+ farbe + "]";
	}
	
	public static void main(String args[]) {
		System.out.println(new Aktenordner(10, "schwarz"));
	}
	

}
