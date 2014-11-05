public class Radio {

  int lautstaerke;
  double frequenz;
  boolean eingeschaltet;

  void waehleSender( double newFrequenz ) {
    if ( eingeschaltet )
      frequenz = newFrequenz;
  }

  void volume( int x ) {
    if ( eingeschaltet ) {
      lautstaerke += x;
      if ( lautstaerke > 100 )
        lautstaerke = 100;
      if ( lautstaerke < 0 )
        lautstaerke = 0;
    }
  }

  void lauter() {
    volume( 1 );
  }

  void leiser() {
    volume( -1 );
  }

  void an() {
    eingeschaltet = true;
  }

  void aus() {
    eingeschaltet = false;
  }

  boolean istAn() {
    return eingeschaltet;
  }

  @Override
  public String toString() {
    return "Radio: Sender = " + frequenz + " Lautstaerke = " + lautstaerke + " "
           + (eingeschaltet ? "Radio ist an." : "Radio ist aus.");
  }
}
