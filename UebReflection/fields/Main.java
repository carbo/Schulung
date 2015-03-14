package UebReflection.fields;

import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {

  public static void main(String[] args) throws IllegalArgumentException,
          IllegalAccessException, NoSuchFieldException {
    Rectangle rect = new Rectangle("football ground", 60, 100, Color.green);
    System.out.println("Object before any changes:\n" + rect);
    Class rectangleClassObject = rect.getClass();

    System.out.println("\nFinding all declared fields and its type:");
    Field[] fields = rectangleClassObject.getDeclaredFields();
    for (Field field : fields) {
      int mod = field.getModifiers();  // get modifiers
      System.out.print("Field: " + Modifier.toString(mod) + " "
              + field.getType() + " " + field.getName());
      if (Modifier.isPrivate(mod)) {
        // Cannot access private members, only public and protected
        System.out.println();
      } else {
        System.out.println(" - with value:" + field.get(rect));
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

    System.out.println("\nFinding all public fields and its type:");
    Field[] pfields = rectangleClassObject.getFields();
    for (Field field : pfields) {
      int mod = field.getModifiers();
      System.out.println("Field: " + Modifier.toString(mod) + " "
              + field.getType() + " " + field.getName());
      if (field.getName().equals("name")) {
       // As the field, name, is public we do not get any IllegalAccessException
       field.set(rect, "Handball court");
      }
    }

    System.out.println("\nFinding a specific public field and its type:");
    // The next statement will throws a NoSuchFieldException
    // if the field, name, was NOT public
    Field field = rectangleClassObject.getField("name");
    int mod = field.getModifiers();
    System.out.println("Field: " + Modifier.toString(mod) + " "
            + field.getType() + " " + field.getName());
    if (field.getName().equals("name")) {
      field.set(rect, "Handball court");
    }


    System.out.println("\nObject after any changes:\n"
            + rect);
  }
}
