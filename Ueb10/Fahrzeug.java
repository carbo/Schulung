package Ueb10;

class Fahrzeug {

	  // 8.13 a)
	  private String  name;
	  private int     anzahlReifen;
	  private Reifen  reifenArt;
	  private boolean faehrt;

	  // 8.13 b)
	  public Fahrzeug (String name, int anzahlReifen, double druck) {
	    this.name = name;
	    this.anzahlReifen = anzahlReifen;
	    reifenArt = new Reifen(druck);
	    faehrt = false;
	  }

	  // 8.13 c)
	  public void fahreLos() {
	    faehrt = true;
	  }

	  // 8.13 d)
	  public void halteAn() {
	    faehrt = false;
	  }

	  // 8.13 e)
	  public void status() {
	    System.out.print(name);
	    if (faehrt)
	      System.out.print(" faehrt ");
	    else
	      System.out.print(" steht ");
	    System.out.print("auf " + anzahlReifen + " Reifen mit je ");
	    System.out.println(reifenArt.aktuellerDruck() + " bar");
	  }
	}
