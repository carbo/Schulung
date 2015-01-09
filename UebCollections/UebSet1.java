package UebCollections;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UebSet1 {
	  
    public static void main(String args[]){ 
    	String[] cars = {"mercedes", "alpha romeo", "bmw"};
        HashSet<String> carStore = new HashSet<String>();
        LinkedHashSet<String> carMarket = new LinkedHashSet<String>();
        TreeSet<String> carBuzz = new TreeSet<String>();
      
        for(String car: Arrays.asList(cars)){
            carStore.add(car);
            carMarket.add(car);
            carBuzz.add(car);
        }
       
        //no ordering in HashSet – elements stored in random order
        System.out.println("Ordering in HashSet :" + carStore);

        //insertion order or elements – LinkedHashSet storeds elements as insertion
        System.out.println("Order of element in LinkedHashSet :" + carMarket);

        //should be sorted order – TreeSet stores element in sorted order 
        System.out.println("Order of objects in TreeSet :" + carBuzz); 
     
        SimpleDateFormat lFormat = new SimpleDateFormat("mm:ss:SSS");  

        //Performance test to insert 10M elements in HashSet, LinkedHashSet and TreeSet
        Set<Integer> numbers = new HashSet<Integer>();
        long startTime = System.currentTimeMillis();
        for(int i =0; i<10000000; i++){
            numbers.add(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total time to insert 10M elements in HashSet in sec : "
                            + lFormat.format(new Date(endTime - startTime)));
      
      
        // LinkedHashSet performance Test – inserting 10M objects
        numbers = new LinkedHashSet<Integer>();
        startTime = System.currentTimeMillis();
        for(int i =0; i<10000000; i++){
            numbers.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Total time to insert 10M elements in LinkedHashSet in sec : "
                            + lFormat.format(new Date(endTime - startTime)));
       
        // TreeSet performance Test – inserting 10M objects
        numbers = new TreeSet<Integer>();
        startTime = System.currentTimeMillis();
        for(int i =0; i<10000000; i++){
            numbers.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Total time to insert 10M elements in TreeSet in sec : "
                            + lFormat.format(new Date(endTime - startTime)));
    }
}


