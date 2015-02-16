package UebSerialisierung;

public class Mitarbeiter implements java.io.Serializable
{
   public String name;
   public String addresse;
   public transient String stimmung;
   public int nummer;
}
