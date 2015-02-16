package UebSerialisierung;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialisierDemo
{
   public static void main(String [] args)
   {
      Mitarbeiter e = null;
      try
      {
         FileInputStream fileIn = new FileInputStream("/tmp/mitarbeiter.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Mitarbeiter) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("Mitarbeiter class not found");
         c.printStackTrace();
         return;
      }
      System.out.println("Deserialized Mitarbeiter...");
      System.out.println("Name: " + e.name);
      System.out.println("Addresse: " + e.addresse);
      System.out.println("Stimmung: " + e.stimmung);
      System.out.println("Nummer: " + e.nummer);
    }
}

