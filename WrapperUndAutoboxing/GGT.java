package WrapperUndAutoboxing;

public class GGT {
    
	  private static int parse(String zahl) throws NumberFormatException {
	    int res = Integer.parseInt(zahl);
	    if (res <= 0) {
	      throw new NumberFormatException(zahl);
	    }
	    return res;
	  }
	  
	  public static void main (String[] args) {
	    
	    // Stimmen die Argumente?
	    if (args.length != 2) {
	      System.out.println("Bitte zwei Zahlen angeben");
	      return;
	    }
	    
	    // Wandle die Argumente um 
	    int a,b;
	    try {
	      a = parse(args[0]);
	    }
	    catch(NumberFormatException e) {
	      System.out.println("zahl1 ungueltig");
	      return;
	    }
	    try {
	      b = parse(args[1]);
	    }
	    catch(NumberFormatException e) {
	      System.out.println("zahl2 ungueltig");
	      return;
	    }
	    
	    // Die eigentliche Berechnung
	    int z = a;
	    int n = b;
	    while (z != n) {
	      if (z > n) 
	        z = z - n;
	      else  
	        n = n - z;
	    }
	    System.out.println("ggT(" + a + "," + b + ") = " + z);
	  }
	}
