package Ueb11;

public class Bouquet {
	
	public void arrangeFlowers() {
		Flower f1 = new Rose();
		Flower f2 = new Lily();
		f1.fragrance();
		f2.fragrance();
	}
	
	public static void main(String args[]) {
		new Bouquet().arrangeFlowers();
	}

}
