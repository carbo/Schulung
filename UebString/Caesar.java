package UebString;

public class Caesar {

	  public static String caesar( String s, int rotation ) {
	    StringBuilder result = new StringBuilder();

	    for ( int i = 0; i < s.length(); i++ ) {
	      char c = s.charAt( i );

	      if ( Character.isUpperCase( c ) )
	        result.append( (char) ('A' + (c - 'A' + rotation) % 26) );
	      else if ( Character.isLowerCase( c ) )
	        result.append( (char) ('a' + (c - 'a' + rotation) % 26) );
	      else
	        result.append( c );
	    }

	    return result.toString();
	  }

	  public static String decaesar( String s, int rotation ) {
	    StringBuilder result = new StringBuilder();

	    for ( int i = 0; i < s.length(); i++ ) {
	      char c = s.charAt( i );

	      if ( Character.isUpperCase( c ) )
	        result.append( (char) ('A' + (c - 'A' + (26 - rotation)) % 26) );
	      else if ( Character.isLowerCase( c ) )
	        result.append( (char) ('a' + (c - 'a' + (26 - rotation)) % 26) );
	      else
	        result.append( c );
	    }

	    return result.toString();
	  }

	  public static void main( String[] args ) {
	    String s = "Haus";

	    char rotation = 4;
	    System.out.println( caesar( s, rotation ) );
	    System.out.println( decaesar( caesar( s, rotation ), 4 ) );
	  }
	}


