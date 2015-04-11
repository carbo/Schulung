package UebDatenstroeme;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Uebung5 {
		public static void main(String[] args) {
			String sourceFileName = "/Users/schulung/workspace/Uebungen/UebDatenstroeme/FileToCopyBuffered.txt";
			  String destinationFileName = "/Users/schulung/workspace/Uebungen/UebDatenstroeme/FileCopiedBuffered.txt";
			  copyFile(sourceFileName, destinationFileName);
		}

		private static void copyFile(String sourceFileName,
				String destinationFileName) {
			BufferedReader br = null;
		      BufferedWriter bw = null;

		      try {
		    	  br = new BufferedReader(new FileReader( sourceFileName ));
		          bw = new BufferedWriter(new FileWriter( destinationFileName ));
		        int c;
		        while ((c = br.read()) != -1)  {
		           bw.write(c);
		        }
		        br.close();
		        bw.close();
		      }catch (Exception e) {
			  e.printStackTrace();
		      }
			
		}

}
