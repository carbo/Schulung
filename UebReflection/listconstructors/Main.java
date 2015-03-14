package UebReflection.listconstructors;

import java.lang.reflect.Constructor;

public class Main {

  public static void main(String[] args) {
    System.out.println("\nFind declared constructors and its parameter types:");
    Class rectangleClassObject = Rectangle.class;
    Constructor[] constructors = rectangleClassObject.getDeclaredConstructors();
    for (Constructor constructor : constructors) {
      System.out.print(constructor.getName() + "(");
      // Find all the parameter types for the constructor
      Class[] paratypes = constructor.getParameterTypes();
      String comma = "";
      for (Class paratype : paratypes) {
        System.out.print(comma + paratype.getName());
        comma = ",";
      }
      System.out.println(")");
    }
  }
}
