package zUeb6;
import Prog1Tools.IOTools;
public class Anagram {
  
  public static boolean istAnagramm( String s1, String s2 ) {
    char[] testArray1 = s1.toCharArray();
    char[] testArray2 = s2.toCharArray();

    java.util.Arrays.sort( testArray1 );
    java.util.Arrays.sort( testArray2 );

    return java.util.Arrays.equals( testArray1, testArray2 );
  }

  public static void main( String[] args ) {
    String s1 = IOTools.readString( "Bitte 1. String eingeben" );
    String s2 = IOTools.readString( "Bitte 2. String eingeben" );

    System.out.println( istAnagramm( s1, s2 ) );

    System.exit( 0 );
  }
}
