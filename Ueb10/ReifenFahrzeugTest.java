package Ueb10;

public class ReifenFahrzeugTest {

	  public static void main (String[] args) {

	    Fahrzeug fahrrad = new Fahrzeug("Fahrrad1", 2, 4.5);
	    Fahrzeug auto    = new Fahrzeug("Auto1"   , 4, 1.9);

	    fahrrad.fahreLos();

	    System.out.println("Zustand 1:");
	    fahrrad.status();
	    auto.status();

	    auto.fahreLos();

	    System.out.println("Zustand 2:");
	    fahrrad.status();
	    auto.status();

	    fahrrad.halteAn();

	    System.out.println("Zustand 3:");
	    fahrrad.status();
	    auto.status();

	    auto.halteAn();

	    System.out.println("Zustand 4:");
	    fahrrad.status();
	    auto.status();
	  }

	}
