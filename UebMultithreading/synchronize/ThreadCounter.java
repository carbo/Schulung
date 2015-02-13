package UebMultithreading.synchronize;

class ThreadCounter extends Thread {
	   private Thread t;
	   private String threadName;
	   Counter  counter;

	   ThreadCounter( String name,  Counter counter){
	       threadName = name;
	       this.counter = counter;
	   }
	   public void run() {
	     counter.countPrint();
	     System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start ()
	   {
	      System.out.println("Starting " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }

	}
