package Ueb10;

class Reifen {

	  /** Reifendruck */
	  private double druck;

	  /** Konstruktor */
	  public Reifen (double luftdruck) {
	    druck = luftdruck;
	  }

	  /** Zugriffsfunktion für Reifendruck */
	  public double aktuellerDruck () {
	    return druck;
	  }
	}
