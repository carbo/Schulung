package UebEnum;

class Nom {
	  private Geschlecht geschlecht;
	  private String name;
	  
	  public Nom(Geschlecht geschlecht,String name) {
	    this.geschlecht = geschlecht;
	    this.name = name;
	  }
	  
	  public String mitArtikel(Fall fall,boolean bestimmt) {
	    final String artikel =
	      (bestimmt ? fall.getBestimmterArtikel(geschlecht) :
	        fall.getUnbestimmterArtikel(geschlecht));
	    return 
	      artikel + " " + name;
	  }  
	}
