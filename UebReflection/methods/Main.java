package UebReflection.methods;

import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

  public static void main(String[] args) throws NoSuchMethodException, 
          IllegalAccessException, IllegalArgumentException,
          InvocationTargetException {
    Rectangle rect = new Rectangle("football ground", 60, 100, Color.green);
    System.out.println("Object before any changes:\n" + rect);
    Class rectangleClassObject = rect.getClass();
    System.out.println("\nFinding all declared methods "
                       +"and its return type and parameter types:");
    Method[] methods = rectangleClassObject.getDeclaredMethods();
    for (Method method : methods) {
      Class retType = method.getReturnType();
      int mod = method.getModifiers();
      System.out.print(Modifier.toString(mod) + " "+retType.getName()
                       + " " + method.getName() + "(");
      Class[] paratypes = method.getParameterTypes();
      String comma = "";
      for (Class paratype : paratypes) {
        System.out.print(comma + paratype.getName());
        comma = ",";
      }
      System.out.println(")");
    }
    System.out.println("\nFinding all public methods"+
                       "and its return type and parameter types:");
    Method[] amethods = rectangleClassObject.getMethods();
    for (Method method : amethods) {
      Class retType = method.getReturnType();
      int mod = method.getModifiers();
      System.out.print(Modifier.toString(mod) + " "+retType.getName()
                       + " " + method.getName() + "(");
      Class[] paratypes = method.getParameterTypes();
      String comma = "";
      for (Class paratype : paratypes) {
        System.out.print(comma + paratype.getName());
        comma = ",";
      }
      System.out.println(")");
    }

    System.out.println("\nFinding a public method and invoke it:");
    Class [] params = {Color.class};
    Method method = rectangleClassObject.getMethod("setColor",params);
    Object [] values = {Color.blue};
    method.invoke(rect, values);

    System.out.println("\nObject after any changes:\n" + rect);

  }
}
