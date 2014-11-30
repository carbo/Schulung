package UebCollections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class EmptyWordRemover {
	  
	  static final List<String> emptyWords = Arrays.asList( "der,das,er,sie,ein,keine,eine,auf".split( "," ) );

	  public static Collection<String> removeEmptyWords( String s ) {
	    Collection<String> result = new HashSet<>();

	    for ( String token : s.split( "[^a-zA-Z0-9äüö–]+" ) )
	      result.add( token.toLowerCase() );

	    result.removeAll( emptyWords );

	    return result;
	  }

	  public static void main( String[] args ) {
	    String s = "Wald ist überflüssig. Auf anderen Planeten gibt es auch keine Bäume.";

	    System.out.println( removeEmptyWords( s ) );
	  }
	}
