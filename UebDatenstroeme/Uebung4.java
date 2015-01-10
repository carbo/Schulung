package UebDatenstroeme;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Uebung4 {
	public static void main(String[] args) {
		String sourceFileName = "/Users/schulung/workspace/Uebungen/UebDatenstroeme/FileToCopy.txt";
		  String destinationFileName = "/Users/schulung/workspace/Uebungen/UebDatenstroeme/FileCopied.txt";
		  copyFile(sourceFileName, destinationFileName);
	}

	private static void copyFile(String sourceFileName,
			String destinationFileName) {
		Reader r = null;
	      Writer w = null; 

	      try {
	      	r = new FileReader( sourceFileName );
	      	w = new FileWriter( destinationFileName );
	        int c;
	        while ((c = r.read()) != -1)  {
	           w.write(c);
	        }
	        r.close();
	        w.close();
	      }catch (Exception e) {
		  e.printStackTrace();
	      }
		
	}

}
