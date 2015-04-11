package UebGenerics;

import java.util.HashMap;
import java.util.Map;

public class UebGenerics2
{
  private Map<String, Integer> map = new HashMap<>();
  
  public static void main(String[] args) {
	  UebGenerics2 wc = new UebGenerics2();
	  wc.update( "Hallo" );
	  wc.update( "Welt" );
	  wc.update( "Hallo" );
	  System.out.println( wc.getWordCount("Hallo") );  // 2
	  System.out.println( wc.getWordCount("Welt") );   // 1
	  System.out.println( wc.getWordCount("NIX") );    // 0
}
  
  public void update( String s )
  {
    map.put( s, getWordCount( s ) + 1 );
    
//    Integer i = map.get( s );
//
//    if ( i == null )
//      map.put( s, 1 );
//    else
//      map.put( s, i++ );    
  }

  public void clear()
  {
    map.clear();
  }

  int getWordCount( String s )
  {
    Integer i = map.get( s );
    
    return i == null ? 0 : i;
  }
}