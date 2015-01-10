package UebDatenstroeme;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Uebung6 {
	public static void main(String[] args) {
	    String name = null;
	    char vokal;
	    File ein, aus;
	    BufferedReader einLeser;
	    BufferedWriter ausSchreiber;
	    try {
	      name = args[0];
	      vokal = args[1].charAt(0);
	      ein = new File("UebDatenstroeme/"+name);
	      System.out.println(ein.getAbsolutePath());
	      aus = new File(name+".ausgabe");
	      einLeser = new BufferedReader(new FileReader(ein));
	      ausSchreiber = new BufferedWriter(new FileWriter(aus));
	    }
	    catch (ArrayIndexOutOfBoundsException aioobe) {
	      System.out.println("Aufruf:  java VokalWandel <Dateiname> <Vokal>");
	      return;
	    }
	    catch (FileNotFoundException fnfe) {
	      System.out.println("Die Datei " + name + " existiert nicht");
	      return;
	    }
	    catch (Exception e) {
	      System.out.println(e);
	      return;
	    }

	    char[] aeiouK = {'a', 'e', 'i', 'o', 'u'};
	    char[] aeiouG = {'A', 'E', 'I', 'O', 'U'};
	    char vK = Character.toLowerCase(vokal);
	    char vG = Character.toUpperCase(vokal);
	    try {
	      String zeile = einLeser.readLine();
	      while (zeile != null) {
	        for (int i=0; i<5; i++) {
	          zeile = zeile.replace(aeiouK[i],vK);
	          zeile = zeile.replace(aeiouG[i],vG);
	        }
	        ausSchreiber.write(zeile);
	        System.out.println(zeile);
	        zeile = einLeser.readLine();
	      }
	      ausSchreiber.close();
	    }
	    catch (IOException ioe) {
	      System.out.println(ioe);
	    }
	  }

}
