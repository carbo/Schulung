package UebSerialisierung;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialisierDemo
{
   public static void main(String [] args)
   {
      Mitarbeiter e = new Mitarbeiter();
      e.name = "Max Mustermann";
      e.addresse = "Musterstrasse 1";
      e.stimmung = "gut";
      e.nummer = 101;
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream("/tmp/mitarbeiter.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/mitarbeiter.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}
