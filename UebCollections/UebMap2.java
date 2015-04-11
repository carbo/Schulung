package UebCollections;

import java.util.*;
import java.util.Map.Entry;

public class UebMap2 {
  
  private Map cars = new HashMap();

  public void add( String name, String email ) {
    cars.put( name, email );
  }

  public String lookup( String name ) {
    return (String)cars.get( name );
  }

  public void list() {
    Set<Map.Entry<String, String>> entrySet = cars.entrySet();

    for ( Iterator<Entry<String, String>> iterator = entrySet.iterator(); iterator.hasNext(); ) {
      Map.Entry<String, String> entry = iterator.next();

      System.out.println( entry.getKey() + "=" + entry.getValue() );
    }
  }

  public String containsSearch( String name ) {
    Iterator<String> i = cars.keySet().iterator();

    while ( i.hasNext() ) {
      String s = i.next();

      if ( s.contains( name ) )
        return lookup( s );
    }
    return null;
  }

  public static void main( String[] args ) {
    UebMap2 cars = new UebMap2();

    cars.add( "Angela", "B-BK-123" );
    cars.add( "Wolfgang", "BN-FM-456" );
    cars.add( "Frank-Walter", "B-12345678" );

    cars.list();

  }
}
