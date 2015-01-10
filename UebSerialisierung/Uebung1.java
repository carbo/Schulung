package UebSerialisierung;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Uebung1 {
	public static void main( String[] args ) throws Exception {
	    HashMap<String, Integer> hm1 = new HashMap<>();
	    hm1.put( "Eins", 1 );
	    hm1.put( "Zwei", 2 );
	    hm1.put( "Drei", 3 );

	    OutputStream fos = new FileOutputStream( "hash.ser" );
	    OutputStream bos = new BufferedOutputStream( fos );
	    //OutputStream gzos = new GZIPOutputStream( bos );
	    ObjectOutputStream oos = new ObjectOutputStream( fos );

	    oos.writeObject( hm1 );

	    oos.close();

	    // *************************************************

	    InputStream fis = new FileInputStream( "hash.ser" );
	    InputStream bis = new BufferedInputStream( fis );
	    //InputStream gzis = new GZIPInputStream( bis );
	    ObjectInputStream ois = new ObjectInputStream( fis );

	    @SuppressWarnings( "unchecked" )
	    HashMap<String, Integer> hm2 = (HashMap<String, Integer>) ois.readObject();

	    ois.close();

	    System.out.println( hm1 );
	    System.out.println( hm2 );
	  }

}
