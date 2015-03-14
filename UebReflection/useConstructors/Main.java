package UebReflection.useConstructors;

import java.awt.Color;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

import UebReflection.listconstructors.Rectangle;

public class Main {
	  public static void main(String[] args) {
	    // An array of Class objects with the correct types for the constructor
	    Class[] parmTypes = {String.class, int.class, int.class, Color.class};
	    // Get a reference to the constructor we want to use
	    Class rectangleClassObject = Rectangle.class;
	    Constructor constructor = null;
	    try {
	      constructor = rectangleClassObject.getConstructor(parmTypes);
	    } catch (NoSuchMethodException ex) {
	      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	    } catch (SecurityException ex) {
	      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    // An array with object values we want to use
	     Object[] parms = {"Room A", 7, 10, Color.red};
	    // create the Object with the newInstance() method
	    try {
	      Rectangle p = (Rectangle) constructor.newInstance(parms);
	      System.out.println(p);
	    } catch (InstantiationException ex) {
	      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	    } catch (IllegalArgumentException ex) {
	      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	    } catch (InvocationTargetException ex) {
	      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	    }
	  }

	}

