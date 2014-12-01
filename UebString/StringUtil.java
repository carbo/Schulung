package UebString;

public class StringUtil
{
   // ----------------------- cleanString ------------------------- \\
   // entfernt alle Sonderzeichen, bzw. übernimmt nur
   // Buchstaben (klein und groß), Ziffern und leerzeichen
   public static String cleanString(String st)
   {
      StringBuffer tmp = new StringBuffer();

      for(int i=0; i<st.length() ; i++)
      {
         char ch = st.charAt(i);
         if (ch==' ' || '0'<=ch && ch<='9' || 'a'<=ch && ch<='z'
                     || 'A'<=ch && ch<='Z')
          tmp.append(ch);
      }
      return tmp.toString();
   }

   // ----------------------- deleteDigits -------------------------\\
   // entfernt alle Ziffern aus einem String
   public static String deleteDigits(String st)
   {
      StringBuffer tmp = new StringBuffer();

      for(int i=0; i<st.length() ; i++)
      {
         char ch = st.charAt(i);
         if (ch<'0' || ch>'9')
          tmp.append(ch);
      }
      return tmp.toString();
   }

   // ---------------------- deleteAllBlanks ---------------------- \\
   // entfernt alle Ziffern aus einem String
   public static String deleteAllBlanks(String st)
   {
      StringBuffer tmp = new StringBuffer();

      for(int i=0; i<st.length() ; i++)
      {
         char ch = st.charAt(i);

         if (ch!=' ')
            tmp.append(ch);
      }

      return tmp.toString();
   }

   // ------------------------ deleteChar ------------------------- \\
   // entfernt alle mehrfachen Blanks aus einem String
   public static String deleteChar(String st, char weg)
   {
      StringBuffer tmp = new StringBuffer();
      for(int i=0; i<st.length() ; i++)
      {
         char ch = st.charAt(i);
         if (ch!=weg)
          tmp.append(ch);
      }
      return tmp.toString();
   }

   // ------------------------ countChar -------------------------- \\
   // zählt, wie oft ein bestimmtes zeichen in einem string vorkommt
   public static int countChar(String st, char toCount)
   {
      int counter=0;
      for(int i=0; i<st.length() ; i++)
      {
         if ( st.charAt(i) == toCount)
          counter++ ;
      }
      return counter;
   }
}