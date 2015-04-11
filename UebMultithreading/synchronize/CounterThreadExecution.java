package UebMultithreading.synchronize;

public class CounterThreadExecution {
	   public static void main(String args[]) {

	      Counter counter = new Counter();

	      ThreadCounter T1 = new ThreadCounter( "Thread - 1 ", counter );
	      ThreadCounter T2 = new ThreadCounter( "Thread - 2 ", counter );

	      T1.start();
	      T2.start();

	      // wait for threads to end
	      try {
	         T1.join();
	         T2.join();
	      } catch( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }
	}
