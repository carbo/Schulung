package UebReflection.useConstructors;

import java.awt.Color;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

import UebReflection.listconstructors.Rectangle;

public class Main {
	  public static void main(String[] args) {
	    Class[] parmTypes = {String.class, int.class, int.class, Color.class};
	    // Get a reference to the constructor we want to use
	    Class rectangleClassObject = Rectangle.class;
	    Constructor constructor = null;
	    try {
	      constructor = rectangleClassObject.getConstructor(parmTypes);
	    } catch (NoSuchMethodException ex) {
	    	ex.printStackTrace();
	    } catch (SecurityException ex) {
	      ex.printStackTrace();
	    }
	    // An array with object values we want to use
	     Object[] parms = {"Raum A", 7, 10, Color.red};
	    // create the Object with the newInstance() method
	    try {
	      Rectangle p = (Rectangle) constructor.newInstance(parms);
	      System.out.println(p);
	    } catch (InstantiationException ex) {
	    	ex.printStackTrace();
	    } catch (IllegalAccessException ex) {
	    	ex.printStackTrace();
	    } catch (IllegalArgumentException ex) {
	    	ex.printStackTrace();
	    } catch (InvocationTargetException ex) {
	    	ex.printStackTrace();
	    }
	  }

	}

