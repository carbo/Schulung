package UebMultithreading.synchronize;

import java.util.Arrays;

public class SynchronizedMethod {
	 
    public static void main(String[] args) throws InterruptedException {
        String[] arr = {"1","2","3","4","5","6"};
        HashMapProcessor hmp = new HashMapProcessor(arr);
        Thread t1=new Thread(hmp, "Thread-1");
        Thread t2=new Thread(hmp, "Thread-2");
        Thread t3=new Thread(hmp, "Thread-3");
        long start = System.currentTimeMillis();
        //start all the threads
        t1.start();t2.start();t3.start();
        //wait for threads to finish
        t1.join();t2.join();t3.join();
        System.out.println("Time taken= "+(System.currentTimeMillis()-start));
        //check the shared variable value now
        System.out.println(Arrays.asList(hmp.getMap()));
    }
 
}
