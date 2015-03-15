package UebReflection.fields;

import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {

  public static void main(String[] args) throws IllegalArgumentException,
          IllegalAccessException, NoSuchFieldException {
    Rectangle rect = new Rectangle("Fußballfeld:", 60, 100, Color.green);
    System.out.println("Objekt vor den Änderungen:\n" + rect);
    Class rectangleClassObject = rect.getClass();

    System.out.println("\nAlle Felder und deren Typ:");
    Field[] fields = rectangleClassObject.getDeclaredFields();
    for (Field field : fields) {
      int mod = field.getModifiers();  // get modifiers
      System.out.print("Feld: " + Modifier.toString(mod) + " "
              + field.getType() + " " + field.getName());
      if (Modifier.isPrivate(mod)) {
        // Cannot access private members, only public and protected
        System.out.println();
      } else {
        System.out.println(" - mit Wert:" + field.get(rect));
      }
      // the int.class returns a Class object
      // this is possible for all primitives
      if (field.getType() == int.class) {
        if (field.getName().equals("width")) {
        // example of using one of the setXXX() method
          field.setInt(rect, 20);
        } else {
        // We can also use the wrapper class for primitive
          field.set(rect, new Integer(40));
        }
      }
    }

    System.out.println("\nAlle public Felder und dessen Typ:");
    Field[] pfields = rectangleClassObject.getFields();
    for (Field field : pfields) {
      int mod = field.getModifiers();
      System.out.println("Feld: " + Modifier.toString(mod) + " "
              + field.getType() + " " + field.getName());
      if (field.getName().equals("name")) {
       // As the field, name, is public we do not get any IllegalAccessException
       field.set(rect, "Handballfeld");
      }
    }

    System.out.println("\nObjekt nach den Änderungen:\n"
            + rect);
  }
}
