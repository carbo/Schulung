package UebEnum;

public class EsWarEinmal {
	  public static void absatz(Object... elemente) {
	    for(Object element : elemente)
	      System.out.print(String.valueOf(element));
	    System.out.println();
	  }
	  public static void main(String... args) {
	    Nom rotkaeppchen = 
	      new Nom(Geschlecht.SAECHLICH,"Rotkaeppchen");
	    Nom wolf =
	      new Nom(Geschlecht.MAENNLICH,"Wolf");
	    Nom oma =
	      new Nom(Geschlecht.WEIBLICH,"Grossmutter");
	    absatz(
	        "Es war einmal ",
	        rotkaeppchen.mitArtikel(Fall.NOMINATIV,false),
	        ", das wollte einen Ausflug zu ",
	        oma.mitArtikel(Fall.DATIV,true),
	        " machen.");
	    absatz(
	        "Im Wald jedoch begegnete es ",
	        wolf.mitArtikel(Fall.DATIV,false),
	        ", und damit beginnt unsere schaurige Geschichte...");
	  }
	}
