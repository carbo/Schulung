package UebDatenstroeme;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Uebung2 {
	public static void main(String[] args) {
		try {
		     
            File file = new File("/Users/schulung/workspace/Uebungen/UebDatenstroeme/Uebung2.out");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");

            // Read a character
            for(int i = 0; i < 5; i++) {
            	byte ch = raf.readByte();
            	System.out.print((char)ch);
            }
            System.out.println("");

            // Now read the remaining portion of the line.
            // This will print out from where the file pointer is located
            // (just after the '+' character) and print all remaining characters
            // up until the end of line character.
            System.out.println("Read rest of line: " + raf.readLine());

            // Seek to the end of file
            raf.seek(file.length());

            // Append to the end of the file
            raf.write(0x0A);
            raf.writeBytes("RandomAccessFile Uebung finished");
            raf.close();
          
        } catch (IOException e) {
            System.out.println("IOException:");
            e.printStackTrace();
        }
    }

}
