package UebDatenstroeme;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileLister {
	public static void main(String[] args) {
		FileLister f = new FileLister();
		f.listDir(new File("/Users/schulung/workspace/datenstroeme"));
		//f.listDir(new File("/Users/schulung/workspace/datenstroeme"), "");
		//List<File> l = f.searchFile(new File("/Users/schulung/workspace/datenstroeme"), "Datei.txt");
//		for(File file : l) {
//			System.out.println(file);
//		}
	}

	public void listDir(File dir) {
		 
		  File[] files = dir.listFiles();
		  if (files != null) { // Erforderliche Berechtigungen etc. sind vorhanden
		    for (int i = 0; i < files.length; i++) {
		      System.out.print(files[i].getAbsolutePath());
		      if (files[i].isDirectory()) {
		        System.out.print(" (Ordner)\n");
		      }
		      else {
		        System.out.print(" (Datei)\n");
		      }
		    }
		  }
		}
	
	private void listDir(File dir, String prefix) {
		 
		  File[] files = dir.listFiles();
		  if (files != null) {
		    for (int i = 0; i < files.length; i++) {
		      System.out.print(prefix + files[i].getAbsolutePath());
		      if (files[i].isDirectory()) {
		        System.out.print(" (Ordner)\n");
		        listDir(files[i], prefix + "  "); // ruft sich selbst auf
		      }
		      else {
		        System.out.print(" (Datei)\n");
		      }
		    }
		  }
		}
	
	public List<File> searchFile(File dir, String find) {
		 
		  File[] files = dir.listFiles();
		  List<File> matches = new ArrayList<File>();
		  if (files != null) {
		    for (int i = 0; i < files.length; i++) {
		      /*
		       * Überprüft, ob der Dateiname mit dem Suchstring übereinstimmt.
		       * Groß- und Kleinschreibung wird ignoriert.
		       */
		      if (files[i].getName().equalsIgnoreCase(find)) {
		        matches.add(files[i]);
		      }
		      if (files[i].isDirectory()) {
		        // Fügt der List die List mit den Treffern aus dem Unterordner zu
		        matches.addAll(searchFile(files[i], find));
		      }
		    }
		  }
		  return matches;
		}
	
	
}
